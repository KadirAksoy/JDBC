package org.kadiraksoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Logger;

public class DatabaseConnection {



    //Database connection
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String name = "root";
        String password = "1234";



        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, name, password);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }




}
