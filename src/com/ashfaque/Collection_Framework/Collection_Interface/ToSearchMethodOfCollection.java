package com.ashfaque.Collection_Framework.Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class ToSearchMethodOfCollection {
    public static void main(String[] args) {
        // (a). contains(Object o)
        Collection c=new ArrayList();
        c.add(10);
        c.add(11);
        c.add(15);
        c.add(13);

//        System.out.println(c.contains(12));
//        System.out.println(c.contains(15));

        // (b). containsAll(Collection c);
        Collection c1=new ArrayList();
        c1.add(10);
        c1.add(30);
        c1.add(40);
        c1.add(13);

        System.out.println(c.containsAll(c1));

        Collection c2=new ArrayList();
        c1.add(10);
        c1.add(11);
        c1.add(15);
        c1.add(13);
        System.out.println(c.containsAll(c2));
    }
}
