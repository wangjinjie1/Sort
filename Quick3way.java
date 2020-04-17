package com.companyid.Sort;

public class Quick3way {
    public static void sort(Comparable []a , int lo , int hi){
        if (lo>=hi) return;
        int lt = lo; int i = lo+1; int gt = hi;
        Comparable t = a[lo];
        while (i <= gt){
            int cmp = a[i].compareTo(t);
            if (cmp < 0){exch(a,i++,lt++);}
            else if (cmp > 0){exch(a,i,gt--);}
            else {i++;}
        }
        sort(a,lo,lt-1);
        sort(a,gt+1,hi);
    }

    public static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void sort(Comparable[] a) {
        sort(a,0,a.length-1);
    }
    public static void show(Comparable []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String[] a = {"R","B","W","W","R","W","B","R","R","W","B","R"};
        show(a);
        sort(a);
        show(a);
    }
}
