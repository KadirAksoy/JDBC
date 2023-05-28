package org.kadiraksoy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DbUpdateValue {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/jdbc";
        String name = "root";
        String password = "1234";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, name, password);

            String query = "UPDATE user SET email = ? WHERE username = ?";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, "kadir@example.com");
            preparedStatement.setString(2, "baran");
            preparedStatement.executeUpdate();

            System.out.println("The user has been successfully updated.");

            preparedStatement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
