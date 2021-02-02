package com.java.collections;

import java.util.*;

public class SetPractice{

    public static void main(String[] args) {

        Set<String> s1 = new HashSet<>();

        s1.add("Spade");
        s1.add("Spade");
        s1.add("Heart");
        s1.add("Flower");

        Iterator itr = s1.iterator();

        while(itr.hasNext()){
           // itr.next();
            System.out.println(itr.next());
        }
        System.out.println("--------------------------");

        Set<String> s2 = new TreeSet<>();
        s2.addAll(s1);

        Iterator itr1 = s2.iterator();

        while(itr1.hasNext()){
            System.out.println(itr1.next());
        }

System.out.println("--------------------------");
        Set<String> s3 = new LinkedHashSet<>();
        s3.add("Kalawar");
        s3.addAll(s1);
        s3.add("Diamond");
        s3.remove("Heart");
        System.out.println(s3.contains("Heart"));
        System.out.println(s3.remove("D"));

        Iterator itr2 = s3.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }





    }
}
