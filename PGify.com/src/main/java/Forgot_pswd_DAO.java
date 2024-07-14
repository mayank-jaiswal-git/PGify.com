import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Forgot_pswd_DAO {
	private String gmail;
	private long phno;
	

	public String getGmail() {
		return gmail;
	}


	public void setGmail(String gmail) {
		this.gmail = gmail;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}
	Forgot_pswd_DAO (){
		
	}
	
	 public boolean forgot_pswd(String gmail , long phno) throws ClassNotFoundException, SQLException {
			
		    String query = " select * from user_registration where email = ? and phone_number = ? ";
		    String url = "jdbc:mysql://localhost:3306/pgify";
	  	    String user = "root";
	  	    String password = "mayank@db";
	  	    
	  	
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection(url,user,password);
			
			 PreparedStatement pst = con.prepareStatement(query);
			  
	  			pst.setString(1, gmail);
	  			pst.setLong(2, phno);
	  			
	  			ResultSet rs = pst.executeQuery();
	  			
	  			
	  			if(rs.next()) {
	  				con.close();
	  				return true;
	  			}else {
	  				return false;
	  			}	
	}

	public static void main(String[] args) {
		
	}

}
