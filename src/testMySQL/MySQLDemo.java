package testMySQL;

import java.sql.*;

public class MySQLDemo {
	public static void main(String args[]) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			System.out.println("Success loading Mysql Driver!");
		} catch (Exception e) {
			System.out.print("Error loading Mysql Driver!");
			e.printStackTrace();
		}
		try {
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql", "root", "159753");

			System.out.println("Success connect MySql server!");
			Statement stmt = connect.createStatement();
			ResultSet rs = stmt.executeQuery("select * from user");
			while (rs.next()) {
				System.out.println(rs.getString("username"));
				System.out.println(rs.getString("password"));
			}
		} catch (Exception e) {
			System.out.print("get data error!");
			e.printStackTrace();
		}
	}
}
