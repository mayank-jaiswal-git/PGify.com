import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PGify_Login_DAO {
	
	private String user_name;
	private String pswd;
	
	
	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
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
	

    PGify_Login_DAO(){
		
	}

	public static void main(String[] args) {
		

	}

}
