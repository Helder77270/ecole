package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Teacher extends Person{

    public Teacher(Integer id, String name, String firstname, String login, String password){
        super(id, name, firstname, login, password);
    }

    public Teacher(String name, String firstname, String login, String password){
        super(name, firstname, login, password);
    }

    public Teacher(){
        super();
    }

    /*public addTeacher(Connection co, Statement stmt){
        String query = "INSERT INTO `teacher`(`id_teacher`, `firstname`, `lastname`, `login`, `password`) VALUES (null, ?, ?,?,?) ";
        // create the mysql insert preparedstatement
        PreparedStatement preparedStmt = co.prepareStatement(query);
        preparedStmt.setString (1, this.getFirstname());
        preparedStmt.setString (2, this.getName());
        preparedStmt.setString (3, this.getLogin());
        preparedStmt.setString (4, this.getPassword());
    }*/

}
