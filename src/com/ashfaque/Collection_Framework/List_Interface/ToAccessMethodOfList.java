package com.ashfaque.Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.List;

public class ToAccessMethodOfList {
    public static void main(String[] args) {

        //(a). get(int index);-to get the element available at particular index.
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        System.out.println(l.get(3));
        System.out.println(l.get(l.size()-1));
    }
}
