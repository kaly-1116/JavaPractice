package com.java.statements;

import java.util.Scanner;

public class nfactorial {
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+num+" is " +fact);

    }


}
