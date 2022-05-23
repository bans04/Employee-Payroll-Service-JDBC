package com.employee_payroll_jdbc;

import java.sql.SQLException;
import java.util.Scanner;

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
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" 1.Retive data \n 2.Update salary \n 3.Sum of salary \n 4.Add new employee");
			System.out.print("Enter your choice:-> ");
			int choice = sc.nextInt();
			
			switch(choice) {
				case 1:
					//String query = "select * from employee_payroll where name = 'Sagar'";
					String query = "select * from employee_payroll where start_date between cast('2019-01-01'\r\n" + "as date) and date(now())";
					dbOperations.retrive(query);
					System.out.println("------------------------------------------------------------");
					
				case 2:
					String query1 = "update employee_payroll set salary = ? where id = 2";
					dbOperations.updatetData(query1);
					System.out.println("------------------------------------------------------------");
					
				case 3:
					//String query2 = "SELECT SUM(salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender";
					//String query2 = "SELECT avg(salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender";
					//String query2 = "SELECT min(salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender";
					//String query2 = "SELECT max(salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender";
					String query2 = "SELECT count(salary) FROM employee_payroll WHERE gender = 'M' GROUP BY gender";
					dbOperations.methodeOperation(query2);
					
				case 4:
					String query3 = "insert into employee_payroll(Id, name, gender, salary, start_date, phone_no, address, departments, deduction, taxable_pay, income_tax)"
							+ "VALUES (7, 'Shivam', 'M', 5677765, '2019-10-24', 67768787676, 'satara', 'produciton', 5677765 * 10/100, 5677765 * 10/100, (5677765 * 10/100) * 10/100 )";
					dbOperations.addNewEmployee(query3);
			}
		}
	}
}
