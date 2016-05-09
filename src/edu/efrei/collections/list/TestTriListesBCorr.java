package edu.efrei.collections.list;

import java.util.Collection;
import java.util.TreeSet;

public class TestTriListesBCorr {

	public TestTriListesBCorr() {
		// TODO Auto-generated constructor stub
	}
	   public static void main(String[] args) {
//	        if (args.length < 1) {
//	            System.out.println("Il faut donner n !");
//	            return;
//	        }
	   //     int n = Integer.parseInt(args[0]);
	      int  n = 33 ;
	        Collection coll = new TreeSet();
	        for (int i = 0; i < n; i++)
	            coll.add(new Integer((int)(1000 * Math.random())));

	        System.out.println(coll);
	    }
}
