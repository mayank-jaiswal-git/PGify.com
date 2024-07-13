

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Forgot_pswd_Filter extends HttpFilter implements Filter {
       
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public Forgot_pswd_Filter() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}
        public boolean forgot_pswd(String gmail , String phno) throws ClassNotFoundException, SQLException {
		
		    String query = " select * from user_registration where gmail = ? and phone_number = ? ";
		    String url = "jdbc:mysql://localhost:3306/pgify";
	  	    String user = "root";
	  	    String password = "mayank@db";
	  	    
	  	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			
			 PreparedStatement pst = con.prepareStatement(query);
 			  
	  			pst.setString(1, gmail);
	  			pst.setString(2, phno);
	  			
	  			ResultSet rs = pst.executeQuery();
	  			
	  			
	  			if(rs.next()) {
	  				con.close();
	  				return true;
	  			}else {
	  				return false;
	  			}	
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		String gmail = request.getParameter("gmail");
		String phno = request.getParameter("phone_number");
		
		
		try {
			if(forgot_pswd(gmail,phno)) {
				chain.doFilter(request, response);
			}
			else {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<h1>"+"YOU ENTER WRONG DETAILS PLEASE ENTER AGAIN...."+"</h1>");
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
