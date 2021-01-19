package com.example.demo;

public class Parent extends Person {

    private String email;
    private String phone_number;

    public Parent(Integer id, String name, String firstname, String login, String password, String email, String phone_number){
        super(id, name, firstname, login, password);
        this.email = email;
        this.phone_number = phone_number;
    }

    public Parent( String name, String firstname, String login, String password, String email, String phone_number){
        super(name, firstname, login, password);
        this.email = email;
        this.phone_number = phone_number;
    }

    public Parent(){
        super();
        this.email = new String();
        this.phone_number = new String();
    }

    @Override
    public String toString() {
        return "Parent{" +
                "email='" + email + '\'' +
                ", phone_number='" + phone_number + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}
