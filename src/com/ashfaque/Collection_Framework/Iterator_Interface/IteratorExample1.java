package com.ashfaque.Collection_Framework.Iterator_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorExample1 {
    public static void main(String[] args) {
        Collection<Integer> c=new ArrayList<>();
        c.add(10);
        c.add(12);
        c.add(15);
        c.add(20);

        Iterator<Integer> itr =c.iterator();
        while (itr.hasNext()){
            int num= itr.next();
            System.out.println(num);

        }
    }
}
