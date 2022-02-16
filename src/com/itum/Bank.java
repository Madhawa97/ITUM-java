package com.itum;

public class Bank {

    // different banks having different interest rates
    // they gonna calc interests

    float getRate(){
        return 0.0f;
    }
}


class NTB extends Bank {
    float getRate(){
        return 2.8f;
    }
}

class HNB extends Bank {
    float getRate(){
        return 0.8f;
    }
}

class ICICBank extends Bank {
    float getRate(){
        return 0.75f;
    }
}

// same method in different classes, but they returning different values

class TestPolymorphism {
    public static void main(String[] args) {
        Bank b; // object reference , not an object

        b = new NTB(); //initialize object not from Bank class but from NTB class;

        System.out.println("NTB Rate is : "+b.getRate());



        b = new HNB();

        System.out.println("HNB Rate is : "+b.getRate());

        // calling same method, we get different output

        // two types of polymorphism. (learn: runtime, compiletime, overriding and overloading)
    }
}