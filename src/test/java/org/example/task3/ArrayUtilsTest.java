package org.example.task3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

//    @Test
//    public void testCountOfWithMultipleOccurrences() {
//        int[] arr = {1, 2, 3, 2, 4, 2};
//        assertEquals(3, ArrayUtils.countOf(arr, 2));
//    }
//
//    @Test
//    public void testCountOfWithSingleOccurrence() {
//        int[] arr = {5, 6, 7};
//        assertEquals(1, ArrayUtils.countOf(arr, 6));
//    }
//
//    @Test
//    public void testCountOfWithNoOccurrence() {
//        int[] arr = {8, 9, 10};
//        assertEquals(0, ArrayUtils.countOf(arr, 1));
//    }
//
//    @Test
//    public void testCountOfWithEmptyArray() {
//        int[] arr = {};
//        assertEquals(0, ArrayUtils.countOf(arr, 0));
//    }

    @Test
    public void testFindMaxWithMaxInMiddle() {
        int[] arr = {1, 5, 3};
        assertEquals(5, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMaxWithMaxAtStart() {
        int[] arr = {10, 2, 3};
        assertEquals(10, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMaxWithMaxAtEnd() {
        int[] arr = {2, 3, 7};
        assertEquals(7, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMaxWithAllSame() {
        int[] arr = {4, 4, 4};
        assertEquals(4, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMaxWithNegativeNumbers() {
        int[] arr = {-10, -20, -3};
        assertEquals(-3, ArrayUtils.findMax(arr));
    }
    @Test
    public void testFindMaxWithSingleElement() {
        int[] arr = {42};
        assertEquals(42, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMaxWithEdgeCases() {
        int[] arr = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        assertEquals(Integer.MAX_VALUE, ArrayUtils.findMax(arr));
    }
    @Test
    public void testFindMaxWithEmptyArray() {
        int[] arr = {};
        assertThrows(ArrayIndexOutOfBoundsException.class, () -> ArrayUtils.findMax(arr));
    }
    public static int findMax(int[] nums) {
        if (nums.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        int max = nums[0];
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }
//    @Test
//    public void testFindMaxWithEmptyArray() {
//        int[] arr = {};
//        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.findMax(arr));
//    }
}
