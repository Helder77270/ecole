package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        ////SpringApplication.run(Main.class, args);
       // ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("src/main/java/com.example.xml/applicationContext.xml");
        try {
            //ApplicationContext appCtx = new ClassPathXmlApplicationContext("src/main/java/com/example/demo/applicationContext.xml");
            Resource r = new ClassPathResource("applicationContext.xml");
            BeanFactory fac = new XmlBeanFactory(r);

            Person person = (Person) fac.getBean("person");
            Parent parent = (Parent) fac.getBean("parent");
            Student student = (Student) fac.getBean("student");
            Teacher teacher = (Teacher) fac.getBean("teacher");

            Chat chat = (Chat) fac.getBean("chat");
            Link link = (Link) fac.getBean("link");

            Document document = (Document) fac.getBean("document");
           // Homework homework = (Homework) fac.getBean("homework");

            //java.lang.Class.forName("com.mysql.cj.jdbc.Driver");

            Connection co = DatabaseConnection.getConnection();
            if (co != null) {
                System.out.println("Connection successful !!!");
            }
            Statement stmt = co.createStatement();


            Teacher t = new Teacher("Salvador","Helder","Heldou77", "Lebgdu77RPZ!!");
            String query = "INSERT INTO `teacher`(`id_teacher`, `firstname`, `lastname`, `login`, `password`) VALUES (null, ?, ?,?,?) ";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = co.prepareStatement(query);
            preparedStmt.setString (1, t.getFirstname());
            preparedStmt.setString (2, t.getName());
            preparedStmt.setString (3, t.getLogin());
            preparedStmt.setString (4, t.getPassword());
            preparedStmt.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
