package org.example.task3;

public class ArrayUtils {
    public static int countOf(int[] x, int target) {
        int count = 0;
        for (int a : x) {
            count = a == target ? count + 1 : count;
        }
        return count;
    }
    public static int findMax(int[] nums) {
        int max = nums[0];
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
}
