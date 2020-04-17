package com.companyid.Sort;

public class Merge {
    private static Comparable aux[];
    private static void sort(Comparable[] a) {
        aux = new Comparable [a.length];
        merge(a,0,a.length-1);
    }
    public static void merge(Comparable []a,int lo,int hi){
        int mid = lo+(hi-lo)/2;
        int m = lo;
        int n = mid+1;
        for (int i = lo; i < a.length; i++) {
            aux[i] = a[i];
        }
        for (int i = lo; i < a.length; i++) {
            if (m>mid){
                a[i] = aux[n++];
            }
            else if (n>hi){
                a[i] = aux[m++];
            }
            else if (less(aux[m],aux[n])){
                a[i] = aux[m++];
            }
            else {
                a[i] = aux[n++];
            }
        }
    }

    private static boolean less(Comparable v, Comparable m) {
        return v.compareTo(m) < 0;
    }
    public static void show(Comparable []a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"E","E","G","M","R","A","C","E","R","T"};
        show(a);
        sort(a);
        show(a);
    }

}
