package org.example.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {
    @Test
    public void testFindMax() {
        int[] arr = {1, 2, 3};
        assertEquals(3, ArrayUtils.findMax(arr));
    }
    @Test
    public void testCountOf() {
        int[] nums = {1, 2, 3, 2, 2, 4};
        assertEquals(3, ArrayUtils.countOf(nums, 2));
        assertEquals(1, ArrayUtils.countOf(nums, 3));
        assertEquals(0, ArrayUtils.countOf(nums, 5));
    }
}
