package com.homework.wk05.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {

    private static Connection conn;

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        if(conn == null) {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
        }
        return conn;
    }
}
