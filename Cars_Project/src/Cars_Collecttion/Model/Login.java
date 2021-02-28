package Cars_Collecttion.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
	Statement stmnt;
	ResultSet results; 
public Boolean login(String emailId,String password,Connection con) {
	try {
		stmnt = con.createStatement();
		results=stmnt.executeQuery("select * from login where emailId='"+emailId+"' and password='"+password+"'");
		return results.next();
	}catch(Exception e) {
		e.printStackTrace();
	}
	return false;
}
}
