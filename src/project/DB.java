package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DB {

	
	public Connection createCon() {
		
		Connection con = null;
		
		try{  


			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/blood_bank","root",""); 
			  
			}catch(Exception e){ 
				System.out.println(e);
			
			}		
		return con;
					  

	}

}
