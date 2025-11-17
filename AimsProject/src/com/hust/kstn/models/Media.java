package com.hust.kstn.models;

public class Media {
    private int id;
    private String title;
    private double cost;
    private String category;
    private static int nbMedia = 0;

    public Media(String title, double cost, String category) {
        this.id = nbThong_tin++;
        this.title = title;
        this.cost = cost;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getCost() {
        return cost;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Media" + "[" + this.id + "]"
            + "[" + this.title + "]"
            + "[" + this.cost + "]"
            + "[" + this.category + "]";
    }
}