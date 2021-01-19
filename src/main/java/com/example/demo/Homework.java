package com.example.demo;

import java.util.ArrayList;
import java.util.Date;

public class Homework {

    private Integer id;
    private String text;
    private Date date;
    private ArrayList<Document> documents = new ArrayList<>();
    private ArrayList<Link> links = new ArrayList<>();

    public Homework(Integer id, String text, Date date, ArrayList<Document> documents, ArrayList<Link> links) {
        this.id = id;
        this.text = text;
        this.date = date;
        this.documents = documents;
        this.links = links;
    }
    public Homework(String text, Date date, ArrayList<Document> documents, ArrayList<Link> links) {
        this.text = text;
        this.date = date;
        this.documents = documents;
        this.links = links;
    }
    public Homework(){
        this.id = new Integer(null);
        this.text = new String();
        this.date = new Date();
        this.documents = new ArrayList<Document>();
        this.links = new ArrayList<Link>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(ArrayList<Document> documents) {
        this.documents = documents;
    }

    public ArrayList<Link> getLinks() {
        return links;
    }

    public void setLinks(ArrayList<Link> links) {
        this.links = links;
    }
}
