package com.java.constructors;

public class BMW {


    public static void main(String[] args) {

        Car bmw = new Car("BMW");
        bmw.brand();

        Car toyota = new Car("Toyota");
        toyota.brand();
        System.out.println(bmw.cost(2000));
        System.out.println(toyota.cost(400));


    }
}
