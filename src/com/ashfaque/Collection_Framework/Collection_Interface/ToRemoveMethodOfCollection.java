package com.ashfaque.Collection_Framework.Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class ToRemoveMethodOfCollection {
    public static void main(String[] args) {
        // remove(Object o);
        Collection c1=new ArrayList();
        c1.add(10);
        c1.add(12);
        c1.add(15);
        c1.add(20);
        c1.remove(15);

        //removeAll(Collection c);
        Collection c2=new ArrayList();
        c2.add("Aspak");
        c2.add(1818);
        c2.add('b');
        c1.addAll(c2);
        System.out.println(c1);
        System.out.println(c2);
        c1.removeAll(c2);
        System.out.println(c1);
        System.out.println("================");

        // retainAll(Collection c);
        c1.add("Aspak");
        c1.retainAll(c2);
        System.out.println(c1);

        // clear();
        c1.clear();
        c2.clear();
        System.out.println(c1);
        System.out.println(c2);
    }
}
