package com.littlewarm.model;

public class Comment {
    public String id;
    public String UserId;
    public String TopicId;
    public String extra;

    public Comment() {}
    public Comment(String id) {
        this.id = id;
    }
}
