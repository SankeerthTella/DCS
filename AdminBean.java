package carserv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminBean {
	private String un;
	private String pw;
	public String getUn() {
		return un;
	}
	public void setUn(String un) {
		this.un = un;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public Boolean adminLoginValidate()
	{
		  boolean a=false;
	    
		try {
			DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "carserv", "carserv");
			String query="select * from admin where AdminID=? and Password=?";
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, un);
			ps.setString(2, pw);
			 ResultSet rs=ps.executeQuery();
			
			 if(rs.next())
			 {
				 a=true;
			 }
			 else
			 {
				 a=false;
			 }
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return a;
				
	}
}
