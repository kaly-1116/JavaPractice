package com.java.statements;

public class IfStatements {

    public static void main(String[] args) {

        //Data types : byte, short,  char , int , long , float, boolean, double

        // byte = 8bits, short = 16bits , 2 bytes, int = 4 bytes , float = 4 bytes, char = 2 bytes,

        byte _a = 1;

        byte $s = 2;

        short b = _a;

        byte b1 = (byte) b; // Type cast

        float f1 = 2f;

        int i = (int) f1;


        System.out.println(b);

        greaterTwoNumbers(5, 5);


    }

    public static void greaterTwoNumbers(int a, int b) {

        if (a > b) {
            System.out.println("A is greater than B");
        } else if (b > a) {
            System.out.println("bB %i is greater ...A.." + b);
        } else if (a==b) {
            System.out.println(" A is equal to B");
        }

 // terinary operatir
        String result = (a > b)  ? (" A id greater ")  : (b>a) ? ("B is greater") : ("A is equal to B");
        System.out.println(result);

        int res = (a > b) ? a : (b > a) ? b : 1;
        System.out.println(res);


    }


    public static void daysOfWeek(String weekDay) {
        if(weekDay.equalsIgnoreCase("Sunday")){
            System.out.println (1);

        } else if (weekDay == "Monday") {
            System.out.println(2);
        }


    }



}
