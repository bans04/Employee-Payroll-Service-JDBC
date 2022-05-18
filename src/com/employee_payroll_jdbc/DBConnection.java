package com.employee_payroll_jdbc;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/*
 *-->Statement:-> Ability to create a payroll service database and have java program connect to database
 * 
 * */
public class DBConnection {
	//database connection 
	String url;
	String user_Id;
	String pass;
	
	public DBConnection(String url, String user_Id, String pass) {
		this.url = url;
		this.user_Id = user_Id;
		this.pass = pass;
	}

	public Connection getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Drive load successfully......|");
		Connection con = DriverManager.getConnection(url, user_Id, pass);
		System.out.println("Connection established successfully.....|");
		return con;
	}
	
	public void closeConnections(Connection con) throws SQLException {
		//stmt.close();
		con.close();
		System.out.println("Connections is closed.....|");
	}
}
