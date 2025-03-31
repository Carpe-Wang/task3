package org.example.task3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayUtilsTest {
    @Test
    public void testFindMax() {
        int[] arr = {1, 2, 3};
        assertEquals(3, ArrayUtils.findMax(arr));
    }
}
