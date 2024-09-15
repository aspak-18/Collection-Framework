package com.ashfaque.Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ToSetOrUpdateMethodOfList {
    public static void main(String[] args) {

        // set(int index,E e):- to set or update element at the given index
        List l = new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(40);
        l.set(6,70);
        System.out.println(l);
    }
}
