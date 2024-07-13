

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet("/forgot_pswd")
public class Forgot_pswd_PGify extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Forgot_pswd_PGify() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gmail = request.getParameter("gmail");
		HttpSession session = request.getSession();
		session.setAttribute("user_gmail",gmail);
		response.sendRedirect("New_pswd_PGify.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
