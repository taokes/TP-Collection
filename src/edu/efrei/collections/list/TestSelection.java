package edu.efrei.collections.list;
import java.util.*;

public class TestSelection {
    
    static Collection<Integer> selection(Collection<Integer> source, TestSelectionI critere) {
        Collection<Integer> res = new ArrayList<Integer>();
        
        Iterator<Integer> iter = source.iterator();
        while (iter.hasNext()) {
            Integer i = iter.next();
            if (critere.ok(i))
                res.add(i);
        }
        return res; 
    }
    
    public static void main(String[] args) {
        Collection<Integer> liste = new LinkedList<Integer>();
        for (int i = 0; i < 50; i++)
            liste.add(new Integer(i));
        
        Collection resultat = selection(liste, new EtreMultipleDe3());
        
        System.out.println(resultat);
    }
}