package com.example.demo;

public class Person {

    private Integer id;
    private String name;
    private String firstname;
    private String login;
    private String password;

    public Person(Integer id, String name, String firstname, String login, String password) {
        this.id = id;
        this.name = name;
        this.firstname = firstname;
        this.login = login;
        this.password = password;
    }

    public Person(String name, String firstname, String login, String password) {
        this.name = name;
        this.firstname = firstname;
        this.login = login;
        this.password = password;
    }

    public Person(){
        //this.id = new Integer(null);
        this.name = new String();
        this.firstname = new String();
        this.login = new String();
        this.password = new String();
    }

    @Override
    public String toString() {
        return "Person{" +
                "id='" + id +
                "name='" + name + '\'' +
                ", firstname='" + firstname + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
