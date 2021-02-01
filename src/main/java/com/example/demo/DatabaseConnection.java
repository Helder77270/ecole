package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DatabaseConnection {
    static Connection conn = null;

    public static Connection getConnection() {
        if (conn != null) return conn;
        try{

            String url = "jdbc:mysql://localhost/projet_java?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String login = "root";
            String pwd = "";
            java.lang.Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(url, login, pwd);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return conn;
    }
}