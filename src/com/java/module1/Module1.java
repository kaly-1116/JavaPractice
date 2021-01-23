package com.java.module1;

public class Module1 {

    public static void main(String[] args) {
        Module1 mod = new Module1();
       mod.add(2,3);
        mod.add(4,3);
        mod.add(2,3,4);

    }
    // method name with arguments and return type, Static and Non Static methods
    public int add(int a, int b){
        int c = a*b; //int, float, double, char, boolean, String "hellow world"
        System.out.println(c);
        return c;
    }

 //method overloading - method with the same name but differnt args or return type - compile time polymorphism
    public int add(int a, int b, int c)
    {
        int d = a+b+c;
        return d;
    }

    public float add(float a, int b)
    {
        float c = a+b;
        return c;
    }
}
