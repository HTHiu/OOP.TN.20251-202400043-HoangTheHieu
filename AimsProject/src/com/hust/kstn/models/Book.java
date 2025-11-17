package com.hust.kstn.models;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	
	private List<BookAuthor> Authors = new ArrayList<>();
    private int authorCount = 0;
    private int numOfTokens;
    
    public Book(String title, String category, double cost, int numOfTokens, BookAuthor[] authors) {
        super(title, category, cost);
        this.numOfTokens = numOfTokens;
        for (int i = 0; i < authors.length; i++) 
            if (authors[i] != null) {
            	this.Authors.add(authors[i]);
                authorCount++;
            }
    }

    public int getNumOfTokens() {
        return numOfTokens;
    }

    @Override
    public String toString() {
        String result = super.toString() + "["
            + this.numOfTokens + "]\n";
        for (int i = 0; i < authorCount; i++) 
            result += this.Authors.get(i).toString();
        return result;
    }
}