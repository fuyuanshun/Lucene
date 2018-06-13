package com.fys.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlUtil {



    public static Connection getConn(String dbName, String username, String password) {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost/"+ dbName + "?characterEncoding=UTF-8", username, password);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}