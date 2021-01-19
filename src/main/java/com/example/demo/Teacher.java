package com.example.demo;

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

}
