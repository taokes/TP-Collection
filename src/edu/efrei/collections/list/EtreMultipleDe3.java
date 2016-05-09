package edu.efrei.collections.list;

class EtreMultipleDe3 implements TestSelectionI {
        public boolean ok(Object x) {
            return x instanceof Integer
                && ((Integer) x).intValue() % 3 == 0;
        }
    }

