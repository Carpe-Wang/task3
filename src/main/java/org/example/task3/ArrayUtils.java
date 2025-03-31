package org.example.task3;

public class ArrayUtils {
    public static int countOf(int[] x, int target) {
        int count = 0;
        for (int a : x) {
            count = a == target ? count + 1 : count;
        }
        return count;
    }
}
