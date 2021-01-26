package com.java.collections;

public class ArraysPractice {

    public static void main(String[] args) {

        // same data type, fixed size
        // init, decl , assign
        int a[] = {1, 2, 3};

        for (int i : a) {
            System.out.println(i);
        }


        int[] months = new int[12]; // size of length 12 -- [0,1,2,....11]
        months[0] = 1;
        months[1] = 2;


        months[11] = 25;
        System.out.println(months[11]);


        int[][] num = {{1, 2, 3}, {4, 5, 6, 11}, {7, 8 , 9, 10, 12}};// num[0] = 1, ,2 ,3, num[1] = 4, 5, 6 // num[0][1] = 2 , num[1][2] = 6
        System.out.println(num[0][0]);
        System.out.println(num[0][1]);
        System.out.println(num[0][2]);

        for (int i = 0; i <= 2; i++) {
            System.out.println(num[0][i]);
        }

        System.out.println(num[1][0]);
        System.out.println(num[1][1]);
        System.out.println(num[1][2]);

        for (int i = 0; i <= 2; i++) {
            System.out.println(num[1][i]);
        }

        for (int i = 0; i < num.length; i++) {
            for(int j= 0 ; j < num[i].length; j++){
                System.out.println(num[i][j]);
            }
        }
    }
}
