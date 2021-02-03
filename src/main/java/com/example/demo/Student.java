package com.example.demo;

public class Student extends Person {

    public Student(Integer id, String name, String firstname, String login, String password){
        super(id, name, firstname, login, password);
    }

    public Student(String name, String firstname, String login, String password){
        super(name, firstname, login, password);
    }

    public Student(){
        super();
    }
}
