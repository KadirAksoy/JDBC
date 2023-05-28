package org.kadiraksoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DbCreateTable {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String name = "root";
        String password= "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, name, password);

            String query = "CREATE TABLE new-table (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50))";

            Statement statement = connection.createStatement();
            statement.executeUpdate(query);

            System.out.println("The new table was created successfully.");

            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
