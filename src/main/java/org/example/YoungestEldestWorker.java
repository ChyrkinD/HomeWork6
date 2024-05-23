package org.example;

public class YoungestEldestWorker {
    private String type;
    private String name;
    private String age;

    public YoungestEldestWorker(String type, String name, String age) {
        this.type = type;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return type + " | " + name + " | " + age;
    }
}
