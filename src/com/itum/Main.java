package com.itum;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ABC obj = new ABC(); // ABC() actually we're calling the constructor

    }
}


class ABC {
    public ABC() { // this is a constructor of ABC class
        System.out.println("This is ABC constructor");  // at the object creation we call the constructor
    }
}