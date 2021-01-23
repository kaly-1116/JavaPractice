package com.java.statements;

public class LoopStatements {
    public static void main(String[] args) {
        nthTable(4);

    }
    //int i = 1;
    public static void nthTable(int n){
                 //System.out.println(i);
        System.out.println( 1 * n);
        System.out.println( 2 * n);
        System.out.println( 3 * n);

        for ( int i=1 ; i <=10; i++){ // init , cond, incre/decre i = [1, 2, 3,...10]
            System.out.println(i * n);
        }

        int arr[] = {1, 2, 3, 4, 5};

        for (int i = 0; i<arr.length; i++){
            System.out.println(n * arr[i]);
        }

        for ( int i : arr){
            System.out.println(i * n);
        }

;
        int i=12;

        while(i<=10) {
            System.out.println("In while loop");
            System.out.println(i * n);
           i++;
        }

        do {
            System.out.println("In dow while lopp");
            System.out.println(i*n);
            i++;
        } while (i<=10);

    }


}
