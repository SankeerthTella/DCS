package carserv;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginBean {
private String un;

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
private String pw;
public Boolean userLoginValidate()
{
	  boolean b=false;
    
	try {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "carserv", "carserv");
		String query="select * from users where UserID=? and Password=?";
		PreparedStatement ps=con.prepareStatement(query);
		ps.setString(1, un);
		ps.setString(2, pw);
		 ResultSet rs=ps.executeQuery();
		
		 if(rs.next())
		 {
			 b=true;
		 }
		 else
		 {
			 b=false;
		 }
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return b;
			
}

}
