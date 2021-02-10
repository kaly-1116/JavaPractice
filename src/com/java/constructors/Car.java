package com.java.constructors;

public class Car extends Vehicle {


    public Car() {
        super.brand();
        System.out.println("Default constructor");

    }

    String brand1;

    public Car(String brand) {
        super(brand);
        this.brand1 = brand;
        System.out.println(" Car brand is" + brand);
    }
    public Car(int brand) {

        System.out.println(" Car brand is" + brand);
    }

    public void brand() {
        super.brand();
        System.out.println("..car  brancd " + brand1);
    }

    public static void main(String[] args) {
        Car c = new Car();

        Car c1 = new Car("Tesko");

    }

    public int cost(int price) {
        return price;
    }

}
