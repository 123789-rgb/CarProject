package Cars_Collecttion.Model;

import java.sql.*;

public class DatabaseConnection {

	private Connection con;
	public Connection databaseConnection() {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 con= DriverManager.getConnection("jdbc:mysql://localhost:3306/cars","root","test");
		 return con;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return  con;
	}
}
