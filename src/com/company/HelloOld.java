package com.company;

import java.util.ArrayList;
import java.util.List;

public class HelloOld {
    public static void main(String[] args) {
        List Q = new ArrayList();
        Q.add("1");
        Q.add("2");
        Q.add("3");
        Q.add("4");
        System.out.println("List Java");
        for(Object queueList : Q){
            System.out.print(queueList +"->");
        }
    }
}
