package com.java.module1;

public class Module2 extends Module1{

    public static void main(String[] args) {

        Module2 mod = new Module2();
        mod.a();

    }

    public void a(){
        add(2,3); //In Child class
        add(2.0f, 3);

        add(1,2,3); // 6

    }

    //method overriding - Runtime polymorphism
    public int add(int a, int b){
        System.out.print("In child class");
        int c = a+b;
        return c;
    }

}
