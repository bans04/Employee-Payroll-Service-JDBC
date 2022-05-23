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
import java.util.Scanner;

public class DBOperation {
	DBConnection dbConnection = new DBConnection("jdbc:mysql://localhost:3306/payroll_service", "root", "Bansode@123");
	Scanner sc = new Scanner(System.in);
	
	public void common(String query) throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		PreparedStatement psmt = con.prepareStatement(query);
		psmt.execute();
		dbConnection.closeConnections(con);
		System.out.println("================================================================");
	}
	
	//retrive data from database
	public void retrive(String query) throws SQLException, ClassNotFoundException {
		Connection con = dbConnection.getConnection();
		//String query = "select * from employee_payroll where name = 'Sagar'";
		//String query = "select * from employee_payroll where start_date between cast('2019-01-01'\r\n" + "as date) and date(now());";
		PreparedStatement psmt = con.prepareStatement(query);
		ResultSet rs = psmt.executeQuery(query);
		while (rs.next())
	      {
	        int id = rs.getInt("id");
	        String firstName = rs.getString("name");
	        String gender = rs.getString("gender");
	        String salary = rs.getString("salary");
	        String start_date = rs.getString("start_date");
	        String phone_no = rs.getString("phone_no");
	        String address = rs.getString("address");
	        String departments = rs.getString("departments");
	        String deduction = rs.getString("deduction");
	        String taxable_pay = rs.getString("taxable_pay");
	        String income_tax = rs.getString("income_tax");
	        
	        // print the results
	        System.out.format("%s, %s, %s, %s, %s, %s, %s, %s, %s, %s\n", id, firstName, gender, salary, start_date, phone_no, address, departments, deduction, taxable_pay, income_tax);
	      }
		System.out.println("records retrive successfully" );
		dbConnection.closeConnections(con);
	}
	
	public void updatetData(String query) throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		//String query = "update employee_payroll set salary = ? where id = 3";
		PreparedStatement psmt = con.prepareStatement(query);
		System.out.println("Enter salary:-> ");
		int salary = sc.nextInt();
		psmt.setLong(1, salary);
		int i= psmt.executeUpdate();  
		System.out.println(i+" records update successfully"); 
		dbConnection.closeConnections(con);
	}
	
	public void methodeOperation(String query) throws ClassNotFoundException, SQLException {
		Connection con = dbConnection.getConnection();
		PreparedStatement psmt = con.prepareStatement(query);
		ResultSet rs = psmt.executeQuery(query);
		rs.next();
		System.out.println(rs.getString(1));
		dbConnection.closeConnections(con);
	}
}
