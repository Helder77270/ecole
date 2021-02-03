package com.example.demo;

public class Link {

    private Integer id;
    private String text;

    public Link(Integer id, String text) {
        this.id = id;
        this.text = text;
    }
    public Link(String text) {
        this.text = text;
    }
    public Link(){
        this.id = new Integer(null);
        this.text = new String();
    }
    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", text='" + text + '\'' +
                '}';
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
}
