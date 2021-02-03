package com.example.demo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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

    public ResultSet selectAllTeacers(Connection co, Statement stmt){
        String query = "SELECT * FROM `teacher`";

        try {
            ResultSet rs = stmt.executeQuery(query);
            return rs;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
    public void addTeacher(Connection co, Statement stmt){
        String query = "INSERT INTO `teacher`(`id_teacher`, `firstname`, `lastname`, `login`, `password`) VALUES (null, ?, ?,?,?) ";

        try {
            PreparedStatement preparedStmt = co.prepareStatement(query);
            preparedStmt.setString(1, this.getFirstname());
            preparedStmt.setString(2, this.getName());
            preparedStmt.setString(3, this.getLogin());
            preparedStmt.setString(4, this.getPassword());
            preparedStmt.execute();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public void updateTeacher(Connection co, Statement stmt){
        String query = "UPDATE teacher SET firstname = ?, lastname = ?, login = ?, password = ? WHERE id_teacher = ?";
        System.out.print(this.getId());
        /*try {
            PreparedStatement preparedStmt = co.prepareStatement(query);
            preparedStmt.setString(1, this.getFirstname());
            preparedStmt.setString(2, this.getName());
            preparedStmt.setString(3, this.getLogin());
            preparedStmt.setString(4, this.getPassword());
            preparedStmt.setInt(5, this.getId());
            preparedStmt.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }*/
    }

}
