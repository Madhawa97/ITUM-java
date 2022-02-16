package com.itum;

import org.w3c.dom.ls.LSOutput;

public class Vehicle {

    String modelYear = "2000";
    String brand = "Toyota";

    public void checkEngineStatus() {
        System.out.println("The engine is running.");
    }
}

class Car extends Vehicle { // inheritance: getting properties from another (parent) class

    public Car() { // constructor
        super(); // but default the constructor having this line (even we write it or not.)
    }             // here it's calling the super class --> which is vehical class

    public static void main(String[] args) {

        String modelYear = "2020";
        String brand = "Honda";

        Car myCar = new Car();
        myCar.checkEngineStatus();

        System.out.println("Model Year"+myCar.modelYear+" : Brand"+myCar.brand);
        System.out.println("Model Year"+modelYear+" : Brand"+brand);
    }

}