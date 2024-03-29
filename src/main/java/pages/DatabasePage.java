package pages;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePage {
	Connection connection;
	Statement statement;
	ResultSet resultset;
	String columnValue;
	
	public String getDataFromDatabase(String columnName) {
				

		try {
// set properties for MySQL 			
			Class.forName("com.mysql.cj.jdbc.Driver");
//			"jdbc:mysql:// + hostName: + portNumber/ + databaseName"
			String sqlUrl = "jdbc:mysql://44.195.13.80:3306/august_2023";
			String sqlUsername = "student";
					String sqlPassword = "Student@123";
					String sqlQuery = "SELECT * from login_data;";
			
//			Create Connection to DB		
			connection = DriverManager.getConnection(sqlUrl, sqlUsername, sqlPassword);
//			Enable connection reference variable to execute queries
			statement = connection.createStatement();
//			Execute queries 
			resultset = statement.executeQuery(sqlQuery);
			
			while(resultset.next()) {
			columnValue = resultset.getString(columnName);
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}finally {
			if(resultset != null) {
				try {
					resultset.close();
				} catch (SQLException e) {		
					e.printStackTrace();
				}
			}
			if(connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		
		return columnValue;		
	}
	
}
