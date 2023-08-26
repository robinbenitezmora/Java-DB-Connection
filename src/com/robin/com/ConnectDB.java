package com.robin.com;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectDB {

	public static void main(String[] args) {
		ConnectDB obj_ConnectDB = new ConnectDB();
		System.out.println(obj_ConnectDB.get_connection());
	}

	public Connection get_connection() {

		Connection connection = null;
		String host = "localhost";
		String port = "5432";
		String db_name = "postgres";
		String username = "postgres";
		String password = "peti2020#";

		try {
			Class.forName("org.postgresql.Driver");
			connection = DriverManager.getConnection("jdbc:postgresql://" + host + ":" + port + "/" + db_name,
					username, password);

			if (connection != null) {
				System.out.println("Connection OK!");
			} else {
				System.out.println("Connection Failed!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return connection;
	}

	public void read_database() {
	}
}
