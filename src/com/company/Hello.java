package com.company;

import java.util.ArrayList;
import java.util.List;

public class Hello {
    public static void main(String[] args) {
        List Q = new ArrayList();
        Q.add("1");
        Q.add("2");
        Q.add("3");
        Q.add("4");
        Q.remove("1");
        Q.remove("3");
        Q.add("8");
        Q.add("9");
        int position = 0;
        System.out.println("List Java");
        for(Object queueList : Q){
            if(Q.size() - 1 > position) {
                System.out.print(queueList +"->");
            } else {
                System.out.print(queueList);
            }
            position++;
        }
    }
}
