package com.companyid.Sort;

public class Quick {
    public static void sort(Comparable []a){
        sort(a,0,a.length-1);
    }

    private static void sort(Comparable[] a, int lo, int hi) {
        if (hi<=lo+15){
            Insertion.sort(a);
            return;
        }
        int j = partition(a,lo,hi);
        sort(a,lo,j-1);
        sort(a,j+1,hi);
    }

    private static int partition(Comparable[] a, int lo, int hi) {
        int i = lo;
        int j =hi+1;
        Comparable v = a[lo];
        while (true){
            while (less(a[++i],v)){
                //if (i == hi) break;
            }
            while (less(v,a[--j])){
                //if (j == lo) break;
            }
            if (i >= j)
                break;
            exch(a,i,j);
        }
        exch(a,i,lo);
        return i;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }

    private static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m) < 0;
    }

    private static void show(Comparable[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"Q","U","I","C","K","S","O","R","T","E","X","A","M","P","L","E"};
        show(a);
        sort(a);
        show(a);
    }

}
