package com.companyid.Sort;

public class ToDownMerge {
    private static Comparable[] aux;
    public static void sort(Comparable []a){
        aux = new Comparable[a.length];
        sort(a,0,(a.length-1));
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        int mid = lo+(hi-lo)/2;
        if (hi<=lo) return;
        sort(a,lo,mid);//将左半边排序
        sort(a,mid+1,hi);//将右半边排序
        merge(a,lo,hi);
    }

    public static void merge(Comparable[] a, int lo, int hi) {
        int mid = lo+(hi-lo)/2;
        int m = lo;
        int n = mid+1;
        for (int i = lo; i < a.length; i++) {
            aux[i] = a[i];
        }
        for (int i = lo; i < a.length; i++) {
            if (m>mid){
                a[i] = aux[n++];
            }else if (n>hi){
                a[i] = aux[m++];
            }else if (less(aux[m],aux[n])){
                a[i] = aux[m++];
            }else {
                a[i] = aux[n++];
            }
        }
    }

    private static boolean less(Comparable n, Comparable m) {
        return n.compareTo(m) < 0;
    }
    public static void show(Comparable[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        String[] a = {"M","E","R","G","E","S","O","R","T","E","X","A","M","P","L","E"};
        show(a);
        sort(a);
        show(a);
    }
}
