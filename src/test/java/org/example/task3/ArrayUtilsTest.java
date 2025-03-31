package org.example.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {

    @Test
    public void testCountOf_basicCase() {
        int[] arr = {1, 2, 3, 2, 4, 2};
        assertEquals(3, ArrayUtils.countOf(arr, 2));
    }

    @Test
    public void testCountOf_noMatch() {
        int[] arr = {1, 2, 3};
        assertEquals(0, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testCountOf_allMatch() {
        int[] arr = {5, 5, 5};
        assertEquals(3, ArrayUtils.countOf(arr, 5));
    }

    @Test
    public void testFindMax_basicCase() {
        int[] arr = {1, 2, 3, 5, 4};
        assertEquals(5, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMax_firstIsMax() {
        int[] arr = {9, 2, 3, 1};
        assertEquals(9, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMax_lastIsMax() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(9, ArrayUtils.findMax(arr));
    }

    @Test
    public void testFindMax_allSame() {
        int[] arr = {4, 4, 4};
        assertEquals(4, ArrayUtils.findMax(arr));
    }
}
