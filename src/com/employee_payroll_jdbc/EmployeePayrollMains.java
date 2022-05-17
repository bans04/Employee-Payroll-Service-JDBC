package com.employee_payroll_jdbc;
/*
 * ------------------------------Employee payroll Main ------------------------------
 * 
 * -->@Dnyandeo Bansode
 * 
 * */
public class EmployeePayrollMains {

	public static void main(String[] args) {
		//instance
		DBConnection dbConnection = new DBConnection();
		String url = "jdbc:mysql://localhost:3306/payroll_service";
		String user_Id = "root";
		String pass = "Bansode@123";
		dbConnection.dbonnection(url, user_Id, pass);
	}
}
