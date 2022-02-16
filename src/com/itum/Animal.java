package com.itum;

abstract class Animal {

    // they can have normal methods
    // they can't have implementation of a abstract method

    public void sleep(){
        System.out.println("Animal is Sleeping...");
    }

    public abstract void animalSound(); // can't implement this method here.

}

//class Lion extends Animal { // as soon as you extend, you get an error. YOU MUST IMPLEMENT THE METHOD BODY HERE.
//}

class Lion extends Animal {
    public void animalSound(){
        System.out.println("The Lion is Roaring...");
    }
}


class TestAnimal {
    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.animalSound();
        lion.sleep();               // calling from super class
    }
}
