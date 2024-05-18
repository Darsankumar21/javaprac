package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {

	public static void main(String[] args) {
		// driver load
		// conn establish
		
		try {
			 String url = "jdbc:mysql://127.0.0.1:3306/";
		     String username = "root";
		     String password = "123456";
//		     Class.forName("oracle.jdbc.driver.OracleDriver");
		    
		    Connection conn = DriverManager.getConnection(url,username,password);
		    Statement stm = conn.createStatement();
		    String query ="create database DB";
		    boolean bl = stm.execute(query);
		    
		     System.out.println("Database created successfully"+bl);
		     
		}catch(Exception e) {
			e.printStackTrace();
		}
		// statement create
				// execute-query
				//conn 

	}

}
