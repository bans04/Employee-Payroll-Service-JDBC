package com.employee_payroll_jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*
 *-->Statement:-> Ability to create a payroll service database and have java program connect to database
 * 
 * */
public class DBConnection {
	//database connection 
	public void dbonnection(String url, String user_ID, String pass) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Drive load successfully......|");
			try {
				Connection con = DriverManager.getConnection(url, user_ID, pass);
				System.out.println("Connection established successfully.....|");
			} catch (SQLException e) {
				System.out.println("Connection not established");
			}
		} catch (ClassNotFoundException e) {
			System.out.println("Drive not loaded");
		}
	}
}
