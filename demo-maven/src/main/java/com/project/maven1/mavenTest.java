package com.project.maven1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class mavenTest {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/bank";
		String username="root";
		String password="Manasa@18";
		Connection connection=null;
		try {
			connection=DriverManager.getConnection(url, username, password);
			System.out.println("Connection is successfully established");
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
	}

	}
	
}	
