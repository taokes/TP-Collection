package edu.efrei.collections.list;

import java.util.*;

public class TestTriListesA {

    public static void main(String[] args) {
//        if (args.length < 1) {
//            System.out.println("Il faut donner n !");
//            return;
//        }
//        int n = Integer.parseInt(args[0]);
        int  n = 33 ;
        List coll = new LinkedList();
        for (int i = 0; i < n; i++)
       //on additionne tirés des valeur au hasard comprise entre 0 et 1000	
            coll.add(new Integer((int)(1000 * Math.random())));
     //   on les tris
        
        Collections.sort(coll);

        System.out.println(coll);
    }
}  
