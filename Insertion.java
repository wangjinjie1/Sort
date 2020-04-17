package com.companyid.Sort;

public class Insertion {
    public static void sort(Comparable []a){
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i+1; j >0 && less(a[j],a[j-1]) ; j--) {
                exch(a,j,j-1);
            }
        }
    }

    public static void exch(Comparable[] a, int j, int i) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    public static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m) < 0;
    }
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"S","O","R","T","E","X","A","M","P","L","E"};
        show(a);
        sort(a);
        show(a);
    }
}
