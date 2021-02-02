package com.java.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList();

        list.add(1);

        list.add(3);

        System.out.println(list);

        list.add(0, 2);
        System.out.println(list);

        list.remove(1);
        System.out.println(list);
        System.out.println(list.get(1));

        List<Integer> l1 = new ArrayList<>();
        System.out.println(l1);

        l1.addAll(list);

        System.out.println(l1);


        Iterator itr = l1.iterator();

        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        for(int i=0; i<l1.size(); i++){
            System.out.println(l1.get(i)); //l1[i]
        }

       /// Arrays = [5, 7, 3, 4, 9] print them in Ascending , sortArrayAscending(arrObj)



    }

}
