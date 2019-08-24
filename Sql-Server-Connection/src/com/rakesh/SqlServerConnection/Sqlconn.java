package com.rakesh.SqlServerConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class Sqlconn {
    public static Connection dbConnector() throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        Connection conn=null;
        try {
            String dbURL = "jdbc:sqlserver://localhost;databaseName=AdventureWorksLT2014;integratedSecurity=true";
             conn = DriverManager.getConnection(dbURL);
            if (conn != null) {
                System.out.println("Connected");
            }
            return conn;

        } catch (SQLException e) {
            System.out.println(e);
            return null;
        }

    }
   
    
    public static void main(String[] args) {
		try {
			Sqlconn.dbConnector();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
