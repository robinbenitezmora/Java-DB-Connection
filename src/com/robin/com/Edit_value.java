package com.robin.com;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Edit_value {
	public static void main(String[] args) {
		Connection connection = null;
		PreparedStatement statement = null;
		ConnectDB obj_ConnectDB = new ConnectDB();
		connection = obj_ConnectDB.get_connection();

		try {
			String query = "update employee set name='Laurent' where sl_no='3'";
			statement = connection.prepareStatement(query);
			statement.executeUpdate();
			System.out.println("Update complete");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
