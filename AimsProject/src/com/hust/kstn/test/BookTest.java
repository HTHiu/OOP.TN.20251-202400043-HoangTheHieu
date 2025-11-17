package com.hust.kstn.test;

import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("Hoang The Hieu", 2006, "Tac gia HHT");
        BookAuthor author2 = new BookAuthor("Bui Cong Hao", 2006, "Tac gia sach Giai tich 1");
        BookAuthor author3 = new BookAuthor("Nguyen Hong Dat", 2006, "Tac gia Hoc Ba ");

        
        BookAuthor[] authors1 = {author1, author2};
        Book book1 = new Book("Toan cao cap", "Dai cuong", 150000.0, 10000, authors1);

        System.out.println(book1);

        BookAuthor[] authors2 = {author3};
        Book book2 = new Book("AURA", "Siu_nhien", 50000, 1000, authors2);

        System.out.println(book2);
    }
}
