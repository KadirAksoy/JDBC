package org.kadiraksoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbSelectValue {

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

            // Prepare and run the query
            String query = "SELECT * FROM user";

            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            // Process results
            while (resultSet.next()) {
                String userName = resultSet.getString("user");
                String email = resultSet.getString("email");
                System.out.println("Username: " + userName + ", Email: " + email);
            }

            // connection closed
            resultSet.close();
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
