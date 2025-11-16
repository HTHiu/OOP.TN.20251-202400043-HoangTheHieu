package com.hust.kstn.models;

public class Thong_tin {
	private int id;
    private String title;
    private double cost;
    private String category;
    private static int nbthong_tin = 0;
    
    public Thong_tin(String title, double cost, String category) {
    	nbthong_tin ++;
    	this.title= title;
    	this.cost= cost;
    	this.category= category;
    }
    
    public int getID() {
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
