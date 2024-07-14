import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PGify_Registration_DAO {
	
	private String fullName;
	private String userName;
	private String Gmail;
	private int phoneNumber;
	private String password;
	private String conpassword;
	private String gender;
	
	
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getGmail() {
		return Gmail;
	}

	public void setGmail(String gmail) {
		Gmail = gmail;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConpassword() {
		return conpassword;
	}

	public void setConpassword(String conpassword) {
		this.conpassword = conpassword;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	
	
	PGify_Registration_DAO(){
		
	}
	
	public void registerUser(String fullName, String userName, String Gmail, long phoneNumber,String upassword,String gender) {
		
        String url = "jdbc:mysql://localhost:3306/pgify";
  	    String user = "root";
  	    String password = "mayank@db";
  	    
//  	    System.out.println(fullName);
//  	   System.out.println(userName);
//  	  System.out.println(Gmail);
//  	  System.out.println(phoneNumber);
//  	  System.out.println(upassword);
  	    
  	  try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,user,password);
		String query = " insert into user_registration (full_name , user_name , email , phone_number , password , gender ) values (?,?,?,?,?,?);";
  	    
	  	  PreparedStatement pst = con.prepareStatement(query);
	  	  
	  	  pst.setString(1, fullName);
	  	  pst.setString(2, userName);
	  	  pst.setString(3, Gmail);
	  	  pst.setLong(4, phoneNumber);
	  	  pst.setString(5, upassword);
	  	  pst.setString(6, gender);
	  	  
	  	 pst.executeUpdate();
	  	
	  	 query = "insert into user_login(email, user_name , password ) values (?,?,?);";
	  		
	  		pst = con.prepareStatement(query);
	  		 
	  		pst.setString(1, Gmail);
	  		pst.setString(2, userName);
	  		pst.setString(3, upassword);
	  		pst.executeUpdate();
	    	
	   
			 con.close();
	  	  
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
  	    
  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
