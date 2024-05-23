package org.example;

public class LongestProject {
    private String id;
    private String date;

    public LongestProject(String name, String date) {
        this.id = name;
        this.date = date;
    }

    @Override
    public String toString() {
        return id + " | " + date;
    }
}
