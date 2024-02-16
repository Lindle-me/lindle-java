package com.m2kdevelopments.lindle.classes;

public class BookmarkFolder {
    private final String id;
    private final String name;
    private final int date;
    private final String folder;

    public BookmarkFolder(String id, String name, int date,  String folder) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.folder = folder;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDate() {
        return date;
    }

    public String getFolder() {
        return folder;
    }
}
