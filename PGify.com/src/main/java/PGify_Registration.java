

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user_register")
public class PGify_Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PGify_Registration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String full_name = request.getParameter("fullname");
		String user_name = request.getParameter("username");
		String gmail = request.getParameter("email");
		String phone_number = request.getParameter("phonenumber");
		String password = request.getParameter("password");
		String gender = request.getParameter("gender");
		
		
		
		PGify_Registration_DAO dao = new PGify_Registration_DAO();
		
		dao.registerUser(full_name, user_name, gmail, phone_number, password, gender);
		
		
		 response.sendRedirect("PGify_Login.jsp");
		
//		PrintWriter out = response.getWriter();
//		response.setContentType("text/html");
//		out.println("<h1>"+"Please Enter a Valid Details...."+"</h1>");
//		out.println("<h1>"+full_name+"</h1>");
//		out.println("<h1>"+user_name+"</h1>");
//		out.println("<h1>"+gmail+"</h1>");
//		out.println("<h1>"+phone_number+"</h1>");
//		out.println("<h1>"+password+"</h1>");
//		out.println("<h1>"+gender+"</h1>");
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
