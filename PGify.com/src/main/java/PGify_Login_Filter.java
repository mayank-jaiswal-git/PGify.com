

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



public class PGify_Login_Filter extends HttpFilter implements Filter {
       
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * @see HttpFilter#HttpFilter()
     */
    public PGify_Login_Filter() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	public boolean user_Login(String user_name , String upassword) throws ClassNotFoundException, SQLException {
		
		String query = " select * from user_login where user_name = ? and password = ? ";
		 String url = "jdbc:mysql://localhost:3306/pgify";
	  	    String user = "root";
	  	    String password = "mayank@db";
	  	    
	  	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			
			 PreparedStatement pst = con.prepareStatement(query);
 			  
	  			pst.setString(1, user_name);
	  			pst.setString(2, upassword);
	  			
	  			ResultSet rs = pst.executeQuery();
	  			
	  			
	  			if(rs.next()) {
	  				con.close();
	  				return true;
	  			}else {
	  				return false;
	  			}
			
		
			
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String name = request.getParameter("uname");
		String pswd = request.getParameter("upassword");
		
		
		try {
			if(user_Login(name,pswd)) {
				chain.doFilter(request, response);
			}
			else {
				PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<h1>"+"LOGIN FAILED PLEASE LOGIN AGAIN...."+"</h1>");
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

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
