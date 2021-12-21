package com.company;

import java.util.LinkedList;

class stackOperation{
    public static void main(String[] args) {
        LinkedList kelas = new LinkedList();
        kelas.add("A");
        kelas.addFirst("B");
        kelas.addFirst("C");
        kelas.addLast("D");
        kelas.add(2, "E");
        kelas.addFirst("F");
        kelas.addLast("G");
        kelas.add(3, "H");
        kelas.remove(0);
        for(Object stackList : kelas){
            System.out.print(stackList+"->");
        }
    }
}