package com.ashfaque.Collection_Framework.List_Interface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IteratorMethodInList {
    public static void main(String[] args) {
        List l=new ArrayList();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);
        l.add(40);
        ListIterator li=l.listIterator(2);

        //(a). add(Object o):- to add an element into list at the previous position of the cursor.
        li.add(100);
        System.out.println(l);

        // (b).set(object o):- to set the element at the list.This method will set the element which is last
        // returned by the next() method.
        li.next();
        li.set(200);
        li.set(300);
        System.out.println(l);

        // (c). hasNext():- returns true if element next to cursor is available, otherwise  it returns false
        ListIterator lit=l.listIterator();
        System.out.println(lit.hasNext());

        // (d). next():- returns element available at the next position of cursor and shift the cursor to the next position.
        System.out.println(lit.next());
        System.out.println(lit.next());

        // (e). hasPrevious():- returns elements if available at previous position of cursor, otherwise returns false
        System.out.println(lit.hasPrevious());
        ListIterator lit1=l.listIterator();
        System.out.println(lit1.hasPrevious());

        // (f). previous():- returns element at the previous position of cursor and cursor will be shifted at prevoius position
        ListIterator lit2=l.listIterator(1);
        System.out.println(lit2.previous());
        // System.out.println(lit2.previous()); // gives NoSuchElementException

        // (g).nextIndex():- returns the index value for the next cursor position
        ListIterator lit4=l.listIterator();
        System.out.println(lit4.nextIndex());

        // (h). previousIndex():- returns the index value where  cursor belongs
        ListIterator lit5=l.listIterator(1);
        System.out.println(lit5.previousIndex());

        // (i). remove():- removes the element from the list which is provided as the last element from next method.
        ListIterator lit6=l.listIterator(0);
        System.out.println(lit6.next());
        lit6.remove();
        System.out.println(l);
    }
}
