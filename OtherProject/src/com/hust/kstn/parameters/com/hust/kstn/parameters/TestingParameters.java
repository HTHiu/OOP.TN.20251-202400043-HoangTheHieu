package com.hust.kstn.parameters;

public class TestingParameters {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Hiu");
        Student s2 = new Student(2, "Dat");
        swap(s1, s2);
        System.out.println("student1: " + s1.getName());
        System.out.println("student2: " + s2.getName());
    }
    
    public static void swap(Object o1, Object o2) {
        Object sswap = o1;
        o1 = o2;
        o2 = sswap;
    }
}