package com.techcarver.main;
import java.sql.Connection;
import java.sql.DriverManager;

public class Test {
public static void main(String[] args) {
	try {
		Class.forName("${JDBC.Driver}");
		Connection connection = DriverManager.getConnection("${JDBC.URL}", "${JDBC.User}", "${JDBC.Pass}");
		System.out.println("Connection Done");
		
		
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
