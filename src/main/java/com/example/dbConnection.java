package com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class dbConnection {
    static String user = "root";
    static String password = "";
    static String url = "jdbc:mysql://localhost:3306/jdbcconnection";


    public static Connection connect() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("Conexion establecida");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}
