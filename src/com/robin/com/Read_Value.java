package com.robin.com;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

public class Read_Value {
 public static void main(String[] args) {
  Connection connection = null;
  Statement statement = null;
  ResultSet rs = null;
  ConnectDB obj_ConnectDB = new ConnectDB();
  connection = obj_ConnectDB.get_connection();

  try {
   String query = "select * from employee";
   statement = connection.createStatement();
   rs = statement.executeQuery(query);

   while (rs.next()) {
    System.out.println(rs.getString(1));
    System.out.println(rs.getString(2));
    System.out.println(rs.getString(3));
   }
  } catch (Exception e) {
   e.printStackTrace();
  }
 }

}
