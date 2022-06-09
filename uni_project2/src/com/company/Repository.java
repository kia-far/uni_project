package com.company;

import java.sql.*;

public class Repository implements AutoCloseable {
    private Connection connection;
    private PreparedStatement preparedStatement;
    private ResultSet resultSet;


    public Repository() throws SQLException {
        connection = DriverManager
                .getConnection("jdbc:mysql://localhost:1522/juni_project" , "root", "12345679");
        connection.setAutoCommit(false);
    }

    public void showName() throws SQLException{
        preparedStatement = connection.prepareStatement("select First name from student");
        resultSet = preparedStatement.executeQuery();
        while (resultSet.next()){
            System.out.println(resultSet.getString(1));
        }
    }

    @Override
    public void close() throws Exception {
        preparedStatement.close();
        connection.close();
    }
}
