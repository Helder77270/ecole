package com.example.demo;

public class Chat {

    private Integer id;
    private String content;

    public Chat(Integer id, String content) {
        this.id = id;
        this.content = content;
    }

    public Chat(String content) {
        this.content = content;
    }

    public Chat(){
        this.id = new Integer(null);
        this.content = new String();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}