package com.java.statements;

public class primefact {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            System.out.println("factors of number "+i+" are ");
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    System.out.println(""+j);
                }
            }
        }
    }
}
