

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Pattern;


public class PGify_Register_Filter extends HttpFilter implements Filter {
   
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public PGify_Register_Filter() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		String full_name = request.getParameter("fullname");
		String user_name = request.getParameter("username");
		String email = request.getParameter("email");
		String phone_number = request.getParameter("phonenumber") ;
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("conpassword");
		String gender = request.getParameter("gender");
		
		
		String full_name_regex = "^[A-Za-z .]{3,}$";
		String user_name_regex = "^[A-Za-z0-9 ._]{3,}$";
		String email_regex = "^[A-Za-z0-9_.]{6,}@[a-z]{3,}[.]{1}[a-z.]{2,6}$";
		String phone_number_regex = "^[6-9]{1}[0-9]{9}$";
		String password_regex = "^(?=.*[0-9])(?=.*[!@#$%^&*])[A-Za-z0-9!@#$%^&*_]{8,16}$";
		
//		Pattern pt = Pattern.compile(full_name_regex);
//		pt = Pattern.compile(user_name_regex);
		
		if(full_name != "null" && user_name != "null" && email != "null" && phone_number != "null" &&  password != "null" && confirm_password != "null" && gender != "null" ) {
		 if(Pattern.matches(full_name_regex, full_name) && Pattern.matches(user_name_regex, user_name) && Pattern.matches(email_regex, email) && Pattern.matches(phone_number_regex, phone_number) && Pattern.matches(password_regex, password)) {
			chain.doFilter(request, response);
		 }
		 else {
			 PrintWriter out = response.getWriter();
				response.setContentType("text/html");
				out.println("<h1>"+"Please Enter a Valid Details regex...."+"</h1>");
			 
		 }
		}
		else {
			PrintWriter out = response.getWriter();
			response.setContentType("text/html");
			out.println("<h1>"+"Please Enter a Valid Details...."+"</h1>");
		}
		
		
	 
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
