package carserv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class RegisterBean {
	
	private String fname;
	private String lname;
	private int age;
	private String gnd;
	private int cn;
	private String uname;
	private String pwd;
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGnd() {
		return gnd;
	}
	public void setGnd(String gnd) {
		this.gnd = gnd;
	}
	public int getCn() {
		return cn;
	}
	public void setCn(int cn) {
		this.cn = cn;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	



public boolean validateUser()
{
	boolean a=false;
    
	try {
		DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "carserv", "carserv");
		String query="insert into users values(?,?,?,?,?,?,?)";
		PreparedStatement ps=con.prepareStatement(query);
		ps=con.prepareStatement(query);
		ps.setString(1,fname);
		ps.setString(2,lname);
		ps.setInt(3,age);
		ps.setString(4,gnd);
		ps.setInt(5,cn);
		ps.setString(6,uname);
		ps.setString(7,pwd);
		int count=0;
		count=ps.executeUpdate();
		System.out.println(count);
		if(count>0)
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
