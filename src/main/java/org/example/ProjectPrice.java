package org.example;

public class ProjectPrice {
    private int id;
    private int price;

    public ProjectPrice(int id, int price) {
        this.id = id;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " | " + price ;
    }
}
