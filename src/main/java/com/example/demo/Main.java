package com.example.demo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.sql.*;
<<<<<<< HEAD
=======
import java.util.ArrayList;
>>>>>>> a6eef1e09da51c1ce264a21d53c05736a12d264e

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


<<<<<<< HEAD
            Teacher t = new Teacher("5448545lsvkoij","Helder","Heldou77", "Lebgdu77RPZ!!");
            //String query = "INSERT INTO `teacher`(`id_teacher`, `firstname`, `lastname`, `login`, `password`) VALUES (null, ?, ?,?,?) ";
=======
            Teacher t = new Teacher("Salvador","Helder","Heldou77", "Lebgdu77RPZ!!");
<<<<<<< Updated upstream
            String query = "INSERT INTO `teacher`(`id_teacher`, `firstname`, `lastname`, `login`, `password`) VALUES (null, ?, ?,?,?) ";
=======

            String query = "INSERT INTO `teacher`" +
                    "(`firstname`, `lastname`, `login`, `password`) " +
                    "VALUES (?, ?,?,?) ";
>>>>>>> Stashed changes
>>>>>>> a6eef1e09da51c1ce264a21d53c05736a12d264e

            ResultSet rs = t.selectAllTeacers(co, stmt);
            while(rs.next()){
                System.out.print(rs.getString("lastname") + "\n");
            }
            // create the mysql insert preparedstatement
            /*PreparedStatement preparedStmt = co.prepareStatement(query);
            preparedStmt.setString (1, t.getFirstname());
            preparedStmt.setString (2, t.getName());
            preparedStmt.setString (3, t.getLogin());
            preparedStmt.setString (4, t.getPassword());
<<<<<<< HEAD
            preparedStmt.execute();*/
=======
            preparedStmt.execute();

           String query1 = "UPDATE teacher SET firstname = ?, lastname = ?, login = ?, password = ? WHERE id_teacher = ?";

            preparedStmt = co.prepareStatement(query1);
            // create the mysql insert preparedstatement
           // PreparedStatement preparedStmt1 = co.prepareStatement(query);

            preparedStmt.setString (1, "Sid-Ahmed");
            preparedStmt.setString (2, "MIR");
            preparedStmt.setString (3,"mirlogin");
            preparedStmt.setString (4,"mirpwd");
            preparedStmt.setInt (5,1);
            preparedStmt.executeUpdate();

            String query2 = "DELETE FROM teacher WHERE id_teacher = ?";

            preparedStmt = co.prepareStatement(query2);
            // create the mysql insert preparedstatement
           // PreparedStatement preparedStmt1 = co.prepareStatement(query);

            preparedStmt.setInt (1,1);
            preparedStmt.execute();

           ResultSet res = stmt.executeQuery("select * from teacher");
            ArrayList<Teacher> teachers = new ArrayList<Teacher>();
            while(res.next()){
                teachers.add
                        (new Teacher(
                                res.getInt("id_teacher"),
                                res.getString("firstname"),
                                res.getString("lastname"),
                                res.getString("login"),
                                res.getString("password")
                                )
                        );

            }
            System.out.println(teachers);
>>>>>>> a6eef1e09da51c1ce264a21d53c05736a12d264e
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
