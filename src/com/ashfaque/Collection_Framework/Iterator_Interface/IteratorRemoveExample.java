package com.ashfaque.Collection_Framework.Iterator_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorRemoveExample {
    public static void main(String[] args) {
        Collection c=new ArrayList();
        c.add(10);
        c.add(12);
        c.add("Aspak");
        c.add(15);
        c.add(20);
        c.add('b');

        Iterator itr =c.iterator();
        while (itr.hasNext()){
            Object o=itr.next();
            if (o instanceof String)
                itr.remove();
            else
                System.out.println(o);
        }

    }
}
