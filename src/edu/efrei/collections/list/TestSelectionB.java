package edu.efrei.collections.list;

import java.util.*;

public class TestSelectionB {
    
    static Collection selection(Collection source, TestSelectionI critere) {
        Collection res;
        try {
	    // il me construit une nouvelle Collection du meme type (dynamique) que source
            res = (Collection) source.getClass().newInstance();
        } catch (Exception e) {
            return null;
        }

        Iterator iter = source.iterator();
        while (iter.hasNext()) {
            Object obj = iter.next();
            if (critere.ok(obj))
                res.add(obj);
        }
        return res;	
    }
    
    public static void main(String[] args) {
        Collection liste = new LinkedList();
        for (int i = 0; i < 50; i++)
            liste.add(new Integer(i));
        
        Collection resultat = selection(liste, new EtreMultipleDe3());
        
        System.out.println(resultat);
    }
}
