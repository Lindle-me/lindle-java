package com.m2kdevelopments.lindle.classes;

public class User {
    final String id;
    final String name;
    final String email;
    final int linkLimit;

    public User(String id, String name, String email, int linkLimit) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.linkLimit = linkLimit;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getLinkLimit() {
        return linkLimit;
    }
}
