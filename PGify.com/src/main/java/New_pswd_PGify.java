

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/New_pswd")
public class New_pswd_PGify extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public New_pswd_PGify() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String gmail = (String) session.getAttribute("user_gmail");
		String new_pswd = request.getParameter("new_pswd");
		
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.println("<h1>"+"this new pswd servlet()"+"</h1>");
		
		New_pswd_DAO dao = new New_pswd_DAO();
		try {
			dao.updatePswd(gmail,new_pswd);
			
//			response.sendRedirect("PGify_Login.jsp");
			RequestDispatcher rd;
			rd = request.getRequestDispatcher("PGify_Login.jsp");
			rd.forward(request, response); 
			
			session.removeAttribute("gmail");
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
