package com.ashfaque.Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ToRemoveMethodOfList {
    public static void main(String[] args) {
        //(a). remove(int index):- to remove the elements as per the given index
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.remove(l.size()-1);
        l.remove(2);
        System.out.println(l);
    }
}
