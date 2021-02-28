package Cars_Collecttion.Model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Database_Logics {
	 Statement stmnt;
	 ResultSet results;
	
public void addNewCar(String  company,String model,String color,String date,int price,String engineCapacity,String licencePlateNumber,int seatingCapacity,String priceRange,String year,Connection con ) {
	try {
		 stmnt= con.createStatement();
		 stmnt.executeUpdate("insert into Collections values('"+company+"','"+model+"','"+color+"','"+date+"','"+price+"','"+engineCapacity+"','"+licencePlateNumber+"','"+seatingCapacity+"','"+priceRange+"','"+year+"')");
	}catch(Exception e) {
		e.printStackTrace();
	}
}


public ResultSet displayCars(Connection con) {
try {
	stmnt=con.createStatement();
    results = stmnt.executeQuery("select * from Collections");
	return results;
	
}catch(Exception e) {
	e.printStackTrace();
}
return null;
	
	
}


public void deleteCarRecord(String licencePlateNumber,Connection con) {
	try {
	stmnt= con.createStatement();
	stmnt.executeUpdate("delete from Collections where Licence_Plate_Number='"+licencePlateNumber+"'");
	}catch(Exception e) {
		e.printStackTrace();
	}
}

public ResultSet updateDetails(String licencePlateNumber,Connection con) {
	try {
		stmnt=con.createStatement();
		ResultSet results = stmnt.executeQuery("Select * from Collections where Licence_Plate_Number='"+licencePlateNumber+"' ");
		return results;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
}

public void updateCarDetails(String  company,String model,String color,String date,int price,String engineCapacity,String licencePlateNumber,int seatingCapacity,String priceRange,String year,Connection con ) {
	try {
		stmnt=con.createStatement();
		 stmnt.executeUpdate("update Collections set Model='"+model+"',Color='"+color+"',Date_of_purchase='"+date+"',Price='"+price+"',Engine_Capacity='"+engineCapacity+"',Licence_Plate_Number='"+licencePlateNumber+"',Seating_Capacity='"+seatingCapacity+"',Price_Range='"+priceRange+"',Year_of_purchase='"+year+"' where Company='"+company+"'");
	}catch(Exception e) {
		e.printStackTrace();
	}

}

public ResultSet search(String search,Connection con) {
	try {
		stmnt=con.createStatement();
		ResultSet results = stmnt.executeQuery("Select * from Collections where Model='"+search+"'or Year_of_purchase='"+search+"'or Color='"+search+"'or Price_Range='"+search+"' ");
		return results;
	}catch(Exception e) {
		e.printStackTrace();
	}
	return null;
    
}

    

}
