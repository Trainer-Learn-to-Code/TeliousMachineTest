package test;

import java.sql.*;

public class DAO {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con=DriverManager.getConnection("jdbc:mysql://192.168.18.245:3306/javadbtest","javadbtest","GFW5sdwfxt");  
	    }catch(Exception e){System.out.println(e);}  
	    return con;  
	}  
	public static int save(AddTable u){  
	    int status=0;  
	    try{  
	        Connection con=getConnection();  
	        PreparedStatement ps=con.prepareStatement(  
	"insert into AddTable (name,city,ctype) values(?,?,?)");  
	        ps.setString(1,u.getName());  
	        ps.setString(2,u.getCity());  
	        ps.setString(3,u.getCtype());    
	        status=ps.executeUpdate();  
	    }catch(Exception e){System.out.println(e);}  
	    return status;  
	}  
}
