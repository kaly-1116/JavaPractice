package com.java.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<String, String> stateCode = new HashMap<>();

        stateCode.put("AP", "Andhra Pradesh");
        stateCode.put("TS", "Telengana");
        stateCode.put("AR", "Arunachal");
        stateCode.put("TN", "TAMIL NADEU");

        System.out.println(stateCode.get("AP"));
       // stateCode.remove("AP1");


        for(Map.Entry<String, String>  entry: stateCode.entrySet()){

            System.out.println(" Keys are "+entry.getKey() + "Values "+entry.getValue());

        }

        Map<String, String> treeMap = new TreeMap<>();
        treeMap.putAll(stateCode);

        for(Map.Entry<String, String>  entry: treeMap.entrySet()){

            System.out.println(" Keys are "+entry.getKey() + "Values "+entry.getValue());

        }

 System.out.println(".. ");
        Map<String, String> linkedhashMap = new LinkedHashMap<>();
        linkedhashMap.putAll(stateCode);

        for(Map.Entry<String, String>  entry: linkedhashMap.entrySet())
        {

            System.out.println(" Keys are "+entry.getKey() + "Values "+entry.getValue());

        }


    }

}
