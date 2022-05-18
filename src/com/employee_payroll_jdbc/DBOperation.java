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
		dbConnection.closeConnections(con);
	}
	
	public void insertData() {
		
	}
}
