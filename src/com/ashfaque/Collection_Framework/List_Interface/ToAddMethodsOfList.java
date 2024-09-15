package com.ashfaque.Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ToAddMethodsOfList {
    public static void main(String[] args) {

        //(a). add(int index, Object o):- to add an object at provided index.
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(1,15);
        l.add(0,15);
        System.out.println(l);

        //(b). addALL(int index,Collection c):- to add a collection of element from the provided index
        List l1=new ArrayList();
        l1.add(1);
        l1.add(2);
        l1.add(1,3);
        l1.add(0,4);
        l.addAll(3,l1);
        System.out.println(l);
    }
}
