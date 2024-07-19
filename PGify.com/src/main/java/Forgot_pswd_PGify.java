

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;
@WebServlet("/forgot_pswd")
public class Forgot_pswd_PGify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Forgot_pswd_PGify() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gmail = request.getParameter("gmail");
		long phno = Long.parseLong(request.getParameter("phone_number"));
		
		Forgot_pswd_DAO dao = new Forgot_pswd_DAO();
		try {
			if(dao.forgot_pswd(gmail, phno) == true) {
				HttpSession session = request.getSession();
				session.setAttribute("user_gmail",gmail);
				
//				RequestDispatcher rd;
//				rd = request.getRequestDispatcher("New_pswd_PGify.jsp");
//				rd.forward(request, response); 
				response.sendRedirect("New_pswd_PGify.jsp");
				
			}
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//		HttpSession session = request.getSession();
//		session.setAttribute("user_gmail",gmail);
//		
		
//		response.sendRedirect("New_pswd_PGify.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
