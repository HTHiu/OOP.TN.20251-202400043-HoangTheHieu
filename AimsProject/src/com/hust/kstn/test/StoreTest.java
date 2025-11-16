package com.hust.kstn.test;


import com.hust.kstn.models.Store;
import com.hust.kstn.models.DigitalVideoDisc;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Self.attention",  "Machine Learning", 
                "ML", 98, 23.76);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Marvel", "Science Fiction", 
                "HT hiu", 100, 64.55);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Gundam", "Animation",
                "Japan",88, 18.99);

        store.addDVD(dvd1);
        store.addDVD(dvd2);
        store.print();

        store.addDVD(dvd3);
        store.print();

        store.removeDVD(dvd1);
        store.removeDVD(dvd3);
        store.print();

        store.removeDVD(dvd2);
        store.removeDVD(dvd3);
        store.print();
    }
}