package com.employee_payroll_jdbc;

import java.sql.SQLException;

/*
 * ------------------------------Employee payroll Main ------------------------------
 * 
 * -->@Dnyandeo Bansode
 * 
 * */
public class EmployeePayrollMains {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		//instance
		DBOperation dbOperations = new DBOperation();
		dbOperations.retrive();
	}
}
