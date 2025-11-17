package com.hust.kstn.models;

public class DigitalVideoDisc extends Disc {
	    private String title;
	    private String category;
	    private String director;
	    private int length;
	    private double cost;
		private static int nbDigitalVideoDisc =0;
		private int id;
	   


public DigitalVideoDisc(String title) {
	this.title=title;
}
public DigitalVideoDisc(String category,String title,double cost) {
	this.category=category;
	this.title=title;
	this.cost=cost;
}
public DigitalVideoDisc(String director, String category, String title, double cost) {
	this.category=category;
	this.title=title;
	this.cost=cost;
	this.director=director;
}
public DigitalVideoDisc(String title, String category, String director, int length, double cost){
	this.category=category;
	this.title=title;
	this.cost=cost;
	this.director=director;
	this.length=length;
}


public String getTitle() {
 return title;
}

public String getCategory() {
 return category;
}

public String getDirector() {
 return director;
}

public int getLength() {
 return length;
}

public double getCost() {
 return cost;
}

public void setTitle(String title) {
 this.title = title;
}

public void setCategory(String category) {
 this.category = category;
}

public void setDirector(String director) {
 this.director = director;
}

public void setLength(int length) {
 this.length = length;
}

public void setCost(float cost) {
 this.cost = cost;
}

//--------------------------------------------------------------------
//In thông tin đĩa
//--------------------------------------------------------------------
public void printInfo() {
 System.out.println(
     "DVD - " + title + " - " + category + " - " + director + " - " + length + " min: " + cost + " $"
 );
}
@Override
public String toString() {
    return "DVD"  + " [" + this.id + "]"
        + " [" + this.title + "]"
        + " [" + this.cost + "]"
        + " [" + this.director + "]"
        + " [" + this.length + "]"
        + " [" + this.category + "]";
}
}