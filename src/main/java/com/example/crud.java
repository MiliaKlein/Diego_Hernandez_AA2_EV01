package com.example;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;

public class crud {

    String user = "root";
    String password = "";
    String url = "jdbc:mysql://localhost:3306/jdbcconnection";

    // Create
    public void createStatement(String sqlCStatement) {

        try {
            Connection connection = dbConnection.connect();
            PreparedStatement statement = connection.prepareStatement(sqlCStatement);

            statement.execute();
            System.out.println("Dato insertado");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    

    // Read
    public void readStatement() {

        String readQuery = "SELECT * FROM";

        try {
            Connection connection = dbConnection.connect();
            PreparedStatement statement = connection.prepareStatement(readQuery);
            ResultSet rSet = statement.executeQuery();

            while (rSet.next()) {
                int id = rSet.getInt(0);
                String name = rSet.getString(1);
                int access_lvl = rSet.getInt(2);
                String user_type = rSet.getString(3);

                System.out.println(String.format("Id: %1$d; Nombre: %1$s; Nivel de Acceso: %2$d; Tipo de Usuario: %2$s",
                 id, name, access_lvl, user_type));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    // Update
    public void updateStatement(String sqlUStatement) {

        try {
            Connection connection = dbConnection.connect();
            PreparedStatement statement = connection.prepareStatement(sqlUStatement);

            statement.execute();
            System.out.println("Dato actualizado");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }


    // Delete
    public void deleteStatement(String sqlDStatement) {

        try {
            Connection connection = dbConnection.connect();
            PreparedStatement statement = connection.prepareStatement(sqlDStatement);

            statement.execute();
            System.out.println("Dato eliminado");
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}