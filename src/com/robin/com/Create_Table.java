package com.robin.com;

import java.sql.Statement;
import java.sql.Connection;

public class Create_Table {
	public static void main(String[] args) {
		Connection connection = null;
		Statement statement = null;
		ConnectDB obj_ConnectDB = new ConnectDB();
		connection = obj_ConnectDB.get_connection();

		try {
			String query = "create table employee(id int(10) not null auto_increment, name varchar(45), age int(10), primary key(id))";
			statement = connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Table created successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}