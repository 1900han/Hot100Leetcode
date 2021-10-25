package com.megamind.sort;

/**
 * O(n2)
 */
public class SelectionSort {
    private SelectionSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arrs) {
        int length = arrs.length;
        for (int i = 0; i < length; i++) {
            int minIndex = i;
            for (int j = i; j < length; j++) {
                if (arrs[j].compareTo(arrs[minIndex]) < 0) {
                    minIndex = j;
                }
            }

            swap(arrs, i, minIndex);
        }
    }

    private static <E> void swap(E[] arrs, int i, int j) {
        E t = arrs[i];
        arrs[i] = arrs[j];
        arrs[j] = t;
    }

    public static void main(String[] args) {
        int[] dataSize = {10000, 100000};
        for (int n : dataSize) {
            Integer[] arr = ArrayGenerator.generateRandomArray(n, n);
            SortingHelper.sortTest("com.megamind.sort.SelectionSort", arr);
        }
    }
}
