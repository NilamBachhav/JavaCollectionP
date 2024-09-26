package org.example;

import java.util.ArrayList;
import java.util.Iterator;
public class TestArrayListDemo1 {
    ArrayList<Integer> intList = new ArrayList<Integer>(10);
        intList.add(80);
        intList.add(10);
        intList.add(80);
        intList.add(190);
        System.out.println("Size of intList: " + intList.size());
        System.out.println( "intList: " + intList);
    Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext())
    {
        System.out.print(" - "+iterator.next());
    }

    public static void main(String[] args) {

    }
}
