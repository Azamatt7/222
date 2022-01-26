package com.company;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
       // System.out.println(j(1,2,3,4,5,6,7,8,9));
        getName("Aktan","Seitek", "Ulan");

    }

   /** public static int j (int ...varags) {
        int counter = 0;
        for (int i = 0; i < varags.length; i++) {
            counter += varags[i];

        }
        return counter;
    }
    */



    public static void  getName(String...aktan) {
        for (String a : aktan) {
            System.out.println(a);
        }
    }
     String name = "MAcbook pro";
    String name2 = name.replace("World","Planet");
     (name2);
}
