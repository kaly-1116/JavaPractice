package com.java.collections;

public class ArraysPractice {

    public static void main(String[] args) {

        // same data type, fixed size
        // init, decl , assign
        int a[] = {1,2,3};

        for (int i : a){
            System.out.println(i);
        }




        int[] months = new int[12]; // size of length 12 -- [0,1,2,....11]
        months[0] = 1;
        months[1] = 2;


        months[11] = 25;
        System.out.println(months[11]);


    }
}
