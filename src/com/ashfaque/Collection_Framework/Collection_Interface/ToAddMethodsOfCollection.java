package com.ashfaque.Collection_Framework.Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class ToAddMethodsOfCollection {
    public static void main(String[] args) {
        // add(Object o);

        Collection c=new ArrayList();
        c.add(10);
        c.add(12);
        c.add(15);
        c.add(20);
        System.out.println(c);

        Collection c1=new ArrayList();
        c1.add("Aspak");
        c1.add("1818");

        // addAll(Collection c);
        c1.addAll(c);
        System.out.println(c1);
    }
}
