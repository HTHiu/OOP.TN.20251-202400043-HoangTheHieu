package com.hust.kstn.test;
import  com.hust.kstn.models.Cart;
import  com.hust.kstn.models.DigitalVideoDisc;

public class CartTest {
    public static void main(String[] args) {
        Cart cart = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Self.attention",  "Machine Learning", 
                                "ML", 98, 23.76);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Marvel", "Science Fiction", 
                                "HT hiu", 100, 66.55);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Gundam", "Animation",
                                "Japan",88, 18.99);

        cart.addDVD(dvd1, dvd2);
        cart.print();

        cart.addDVD(dvd3);
        cart.print();

        cart.removeDVD(dvd1);
        cart.removeDVD(dvd3);
        cart.print();

        cart.removeDVD(dvd2);
        cart.removeDVD(dvd3);
        cart.print();
    }
}
