package com.megamind.sort;

import java.lang.reflect.Method;

public class SortingHelper {
    private SortingHelper() {
    }

    public static <E extends Comparable<E>> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1].compareTo(arr[i]) > 0) {
                return false;
            }
        }
        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {

        try {
            Class<?> sortClass = Class.forName(sortName);
            Method sortMethod = sortClass.getMethod("sort", Comparable[].class);
            Object[] params = new Object[]{arr};

            long startTime = System.nanoTime();
            sortMethod.invoke(null, params);
            long endTime = System.nanoTime();

            double time = (endTime - startTime) / 1000000000.0;
            if (!SortingHelper.isSorted(arr)) {
                throw new RuntimeException(sortName + " failed");
            }
            System.out.println(String.format("%s, n = %d : %f s", sortName, arr.length, time));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Error in SortingHelper.sortTest!");
        }


    }
}
