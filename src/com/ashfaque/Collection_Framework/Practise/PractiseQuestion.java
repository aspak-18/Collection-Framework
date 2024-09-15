package com.ashfaque.Collection_Framework.Practise;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

/* WAJP to create list and wherever there is an odd number then make it double*/

public class PractiseQuestion {
    public static void main(String[] args) {
        List l = new ArrayList();
        l.add(10);
        l.add(21);
        l.add(30);
        l.add(41);
        l.add(50);
        l.add(61);
        l.add(40);

        Iterator itr=l.iterator();
        int index=0;
        while (itr.hasNext()){
            Integer num=(Integer) itr.next();
            if (num%2!=0){
                l.set(index,num*2);
            }
            index++;
        }
        System.out.println(l);
    }
}
