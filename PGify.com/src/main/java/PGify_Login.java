

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/user_login")
public class PGify_Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public PGify_Login() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String name = request.getParameter("uname");
		String pswd = request.getParameter("upassword");
		
		PGify_Login_DAO dao = new PGify_Login_DAO();
		try {
			if(dao.user_Login(name,pswd)) {
				String user_name = request.getParameter("uname");
				HttpSession session = request.getSession();
				session.setAttribute("user_name",user_name);
				
				
				response.sendRedirect("PGify.jsp");
			}
			else {
				/*
				 * PrintWriter out = response.getWriter(); response.setContentType("text/html");
				 * out.println("<h1>"+"LOGIN FAILED PLEASE LOGIN AGAIN...."+"</h1>");
				 */
				 String msg ="Invalid User Name or Password...";
                 HttpSession session = request.getSession();
                 session.setAttribute("error",msg);
                 response.sendRedirect("PGify_Login.jsp");
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
		}
	
	}

}
