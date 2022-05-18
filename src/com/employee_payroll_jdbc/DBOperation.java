package com.employee_payroll_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
/*
 * --> Statement:-> Ability for Employee Payroll Service to retrieve the Employee Payroll from the Database
 * 
 * -->@Dnyandeo Bansode
 * */

public class DBOperation {
	DBConnection dbConnection = new DBConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Bansode@123");
	
	//retrive data from database
	public void retrive() throws SQLException, ClassNotFoundException {
		Connection con = dbConnection.getConnection();
		String query = "select * from employee_payroll";
		PreparedStatement psmt = con.prepareStatement(query);
		ResultSet rs = psmt.executeQuery(query);
		System.out.println("records retrive successfully");
		dbConnection.closeConnections(con);
	}
	
	public void updatetData() throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		String query = "update employee_payroll set salary = ? where id = 5";
		PreparedStatement psmt = con.prepareStatement(query);
		psmt.setString(1, "3000000");
		int i= psmt.executeUpdate();  
		System.out.println(i+" records update successfully"); 
		dbConnection.closeConnections(con);
	}
}
