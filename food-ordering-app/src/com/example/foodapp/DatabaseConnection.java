package com.example.foodapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;

    private DatabaseConnection() {
        String url = "jdbc:postgresql://localhost:5432/food_order_db";
        String user = "lolop";
        String pass = "kartofel";

        try {
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection(url, user, pass);
            System.out.println("Подключение к базе данных успешно установлено.");
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("Ошибка при подключении к БД!");
        }
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public Connection getConnection() {
        return connection;
    }
}