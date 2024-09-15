package com.ashfaque.Collection_Framework.Practise;


import java.util.*;

public class Question1 {
    public static void main(String[] args) {
        List l =new ArrayList(Arrays.asList(5,8,9,7,5,4));
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
        Collections.sort(l);
    }
}
