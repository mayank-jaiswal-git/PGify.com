import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class New_pswd_DAO {
	private String gamil;
	private String phno;
	private String new_pswd;
	

	public String getGamil() {
		return gamil;
	}


	public void setGamil(String gamil) {
		this.gamil = gamil;
	}


	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}


	public String getNew_pswd() {
		return new_pswd;
	}


	public void setNew_pswd(String new_pswd) {
		this.new_pswd = new_pswd;
	}
    
	
	New_pswd_DAO(){
		
	}
	
	public  void updatePswd(String gmail,String new_pswd) throws ClassNotFoundException, SQLException {
		 String url = "jdbc:mysql://localhost:3306/db_2";
	  	    String user = "root";
	  	    String password = "mayank@db";
	  	    
	  		// 1. Load and register JDBC driver
	  	     Class.forName("com.mysql.cj.jdbc.Driver");
	  			  
	  	 // 2. Create Connection
	  	     Connection con = DriverManager.getConnection(url,user,password);
	  	     
	  	   String query = " UPDATE user_registration SET password = ? WHERE gmail = ?; ";
	  		 PreparedStatement pst = con.prepareStatement(query);
	  		  
	  		 pst.setString(1, new_pswd);
	  		 pst.setString(2, gmail);
	  		pst.executeUpdate();
	  		
            String   query1 = " UPDATE user_login SET password = ? WHERE gmail = ?; ";
	  		
	  		pst = con.prepareStatement(query1);
	  		 
	  		pst.setString(1, new_pswd);
	  		pst.setString(2, gmail);
	  		pst.executeUpdate();
	    	
	   
			 con.close();
	}

	public static void main(String[] args) {
		

	}

}
