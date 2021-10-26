package com.megamind.sort;

public class InsertionSort {
    private InsertionSort() {
    }

    // [5 3 9 4 6 1]
    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            E t = arr[i];
            int j;
            for (j = i; j - 1 >= 0 && t.compareTo(arr[j - 1]) < 0; j--) {
                arr[j] = arr[j - 1];
            }
            arr[j] = t;
        }
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateOrderedArray(n);
            SortingHelper.sortTest("com.megamind.sort.InsertionSort", arr);
        }
    }
}
