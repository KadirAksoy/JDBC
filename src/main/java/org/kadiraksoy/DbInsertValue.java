package org.kadiraksoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbInsertValue {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/jdbc";
        String name = "root";
        String password= "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, name, password);

            String query = "INSERT INTO user (username, email) VALUES (?, ?)";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "kadir_baran");
            preparedStatement.setString(2, "aksoy@email.com");
            preparedStatement.executeUpdate();

            System.out.println("User added successfully\n.");

            preparedStatement.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
