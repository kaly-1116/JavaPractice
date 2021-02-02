package com.java.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        Map<String, String> stateCode = new HashMap<>();

        stateCode.put("AP", "Andhra Pradesh");
        stateCode.put("TS", "Telengana");
        stateCode.put("AP1", "Arunachal");

        System.out.println(stateCode.get("AP"));
        stateCode.remove("AP1");


        for(Map.Entry<String, String>  entry: stateCode.entrySet()){

            System.out.println(" Keys are "+entry.getKey() + "Values "+entry.getValue());

        }



    }

}
