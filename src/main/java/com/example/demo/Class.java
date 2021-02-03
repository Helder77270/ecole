package com.example.demo;

import java.util.ArrayList;

public class Class {
    private Integer id;
    private Integer nb_max_student;
    private Teacher teacher;
    private ArrayList<Student> students = new ArrayList<Student>();

    public Class(Integer id, Integer nb_max_student, Teacher teacher, ArrayList<Student> students) {
        this.id = id;
        this.nb_max_student = nb_max_student;
        this.teacher = teacher;
        this.students = students;
    }
    public Class(Integer nb_max_student, Teacher teacher, ArrayList<Student> students) {
        this.nb_max_student = nb_max_student;
        this.teacher = teacher;
        this.students = students;
    }
    public Class(){
        this.id = new Integer(null);
        this.nb_max_student = new Integer(null);
        this.teacher = new Teacher();
        this.students = new ArrayList<Student>();
    }

    @Override
    public String toString() {
        return "Class{" +
                "nb_max_student=" + nb_max_student +
                ", teacher=" + teacher +
                ", students=" + students +
                '}';
    }

    public Integer getNb_max_student() {
        return nb_max_student;
    }

    public void setNb_max_student(Integer nb_max_student) {
        this.nb_max_student = nb_max_student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
}
