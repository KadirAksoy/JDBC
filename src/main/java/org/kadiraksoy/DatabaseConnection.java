package org.kadiraksoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class DatabaseConnection {



    //Database connection
    public static void main(String[] args) {
        // Required information for database connection
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String name = "root";
        String password = "1234";



        try {
            // JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            // connect to databases
            Connection connection = DriverManager.getConnection(url, name, password);
            System.out.println("connected to the database.");

            //connection closed
            connection.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




}
