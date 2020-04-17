package com.companyid.Sort;

public class Selection {
    public static  void sort(Comparable []a){
        for (int i = 0; i < a.length; i++) {
            int min = i;
            for (int j = i+1; j < a.length; j++) {
                if (less(a[j],a[min])){
                    min = j;
                }
                exch(a,i,min);
            }

        }
    }

    public static void exch(Comparable[] a, int i, int j) {
            Comparable t = a[i];
            a[i] = a[j];
            a[j] = t;
    }

    public static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m)<0;
    }
    private static void show(Comparable []a){
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
