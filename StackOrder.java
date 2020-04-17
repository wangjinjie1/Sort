package com.companyid.Sort;

public class StackOrder {
    public static void sort(Comparable []a){
        int N = a.length-1;
        for (int k = N/2 ; k >= 1 ; k--) {
            sink(a,k,N);
        }
        while (N > 1){
            exch(a,1,N--);
            sink(a,1,N);
        }
    }

    private static void sink(Comparable[] a, int k, int hi) {
        while (2*k <= hi){
            int j = 2*k;
            if (j < hi && less(a[j],a[j+1])){
                j++;
            }
            if (!less(a[k],a[j]))break;
            exch(a,k,j);
            k = j;
        }
    }

    private static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m) < 0;
    }

    private static void exch(Comparable[] a, int i, int j) {
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    public static void show(Comparable []a){
        for (int i = 1; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"0","S","O","R","T","E","X","A","M","P","L","E"};
        show(a);
        sort(a);
        show(a);
    }
}
