package com.ashfaque.Collection_Framework.Collection_Interface;

import java.util.ArrayList;
import java.util.Collection;

public class MiscellaneousMethodOfCollection {
    public static void main(String[] args) {
        // (a). size():- to get size of a given collection
        Collection c = new ArrayList();
        c.add(10);
        c.add(12);
        c.add(15);
        c.add(20);
        System.out.println(c.size());

        /*(b). equals():- to compare one collection with another colection.If both collection are
        equal in size and in sequence, then it will return true or else return false
         */
        Collection c1=new ArrayList();
        c1.add(10);
        c1.add(12);
        c1.add(15);
        c1.add(20);

        System.out.println(c.equals(c1));

        // (c). isEmpty():- returns true if collection is empty else returns false
        Collection c2=new ArrayList();
        c2.add(25);
        if (c2.isEmpty())
            System.out.println("c2 is empty");
        else
            System.out.println("c2 is not empty");

        // (d). toArray():- to convert collection into an array
        Collection c3 = new ArrayList();
        c3.add(10);
        c3.add(12);
        c3.add(15);
        c3.add(20);

        Object[] arr=c3.toArray();

        System.out.println(arr.length);
        for (Object x:arr)
            System.out.print(x+" ");

        //(e). hashcode():- to get hashcode of a collection object
        Collection c4 = new ArrayList();
        c4.add(10);
        c4.add(12);
        c4.add(15);
        c4.add(20);

        System.out.println("\n"+c4.hashCode());

    }
}
