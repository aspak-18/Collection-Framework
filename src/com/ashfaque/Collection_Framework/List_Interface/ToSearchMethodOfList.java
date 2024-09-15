package com.ashfaque.Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ToSearchMethodOfList {
    public static void main(String[] args) {
        /* (a). indexOf(Object o):- to search an element in the list. By this method index
        of first occurrence of the element will be provided.*/
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(40);
        System.out.println(l.indexOf(40));

        // (b). latIndexOf(Object o):- to get the last index of repeated occured element
        System.out.println(l.lastIndexOf(40));
    }
}
