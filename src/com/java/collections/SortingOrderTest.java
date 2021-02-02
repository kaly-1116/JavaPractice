package com.java.collections;

public class SortingOrderTest {


    public static void main(String[] args) {

        int[]  unsortedArr = { 2, 6, 3, 4} ;

        sortedArrAscending(unsortedArr);

    }


    public static void sortedArrAscending(int[] arr){

        int temp = 0;


        System.out.println("Elements in array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


        for (int i = 0; i < arr.length; i++) {    // leng = 4, i = 0  2 lopp a[i] = 6
            for (int j = i+1; j < arr.length; j++) { // j = 1, len = 4 .. j = 2
                if(arr[i] > arr[j]) { // a[0] = 2, a[j] = a[1] = 6 .. 2 loop... 2 > 3 .... 3 lop  2 > 4
                    temp = arr[i]; // temp = 6
                    arr[i] = arr[j];  // arr[i] = 3
                    arr[j] = temp;  // arr[j] = 6
                }
            }
        }

        System.out.println();


        System.out.println("Elements in ascending order: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void sortedArrDescending(int[] arr){


    }
}
// sorting array