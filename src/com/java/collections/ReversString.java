package com.java.collections;

import com.sun.javafx.binding.StringFormatter;

public class ReversString {

    public static void main(String[] args) {

        String str = "Hello World";

        reverseString(str);

        System.out.println("....");
        StringFormatt sf= new StringFormatt();
        System.out.println(StringFormatt.reverseString("programmer"));


    }

    public static void reverseString(String str){

        char[] a = str.toCharArray(); // ['p', 'r' , 'o' , 'g' ......]

        for (int i=a.length-1; i>=0; i-- ){
            System.out.print(a[i]);
        }

    }

}
//reverse

 class StringFormatt {
    public static String reverseString(String str){
        StringBuilder sb=new StringBuilder(str); // String str = "programmer" - , str =  "javaprogrammer"
        sb.reverse(); //
        return sb.toString();
    }
}


 class TestStringFormatter {
    public static void main(String[] args) {
        System.out.println(StringFormatt.reverseString("hello world"));
        System.out.println(StringFormatt.reverseString("I am kalyan"));
    }
}