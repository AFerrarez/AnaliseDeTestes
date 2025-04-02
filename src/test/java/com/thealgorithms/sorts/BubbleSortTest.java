package com.thealgorithms.sorts;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

/**
 * @author Aitor Fidalgo (https://github.com/aitorfi)
 * @see BubbleSort
 */
public class BubbleSortTest {

    private BubbleSort bubbleSort = new BubbleSort();

    @Test
    public void bubbleSortEmptyArray() {
        Integer[] inputArray = {};
        Integer[] outputArray = bubbleSort.sort(inputArray);
        Integer[] expectedOutput = {};
        assertArrayEquals(outputArray, expectedOutput);
    }

    @Test
    public void bubbleSortSingleIntegerElementArray() {
        Integer[] inputArray = {4};
        Integer[] outputArray = bubbleSort.sort(inputArray);
        Integer[] expectedOutput = {4};
        assertArrayEquals(outputArray, expectedOutput);
    }

    @Test
    public void bubbleSortSingleStringElementArray() {
        String[] inputArray = {"s"};
        String[] outputArray = bubbleSort.sort(inputArray);
        String[] expectedOutput = {"s"};
        assertArrayEquals(outputArray, expectedOutput);
    }

    @Test
    public void bubbleSortIntegerArray() {
        Integer[] inputArray = {4, 23, -6, 78, 1, 54, 23, -6, -231, 9, 12};
        Integer[] outputArray = bubbleSort.sort(inputArray);
        Integer[] expectedOutput = {
            -231,
            -6,
            -6,
            1,
            4,
            9,
            12,
            23,
            23,
            54,
            78,
        };
        assertArrayEquals(outputArray, expectedOutput);
    }

    @Test
    public void bubbleSortStringArray() {
        String[] inputArray = {
            "cbf",
            "auk",
            "ó",
            "(b",
            "a",
            ")",
            "au",
            "á",
            "cba",
            "auk",
            "(a",
            "bhy",
            "cba",
        };
        String[] outputArray = bubbleSort.sort(inputArray);
        String[] expectedOutput = {
            "(a",
            "(b",
            ")",
            "a",
            "au",
            "auk",
            "auk",
            "bhy",
            "cba",
            "cba",
            "cbf",
            "á",
            "ó",
        };
        assertArrayEquals(outputArray, expectedOutput);
    }


    @Test
    public void bubbleSortArrayWithDuplicates() {
        Integer[] inputArray = {5, 5, 5, 5, 5};
        Integer[] outputArray = bubbleSort.sort(inputArray);
        Integer[] expectedOutput = {5, 5, 5, 5, 5};
        assertArrayEquals(outputArray, expectedOutput);
    }

    @Test
    public void bubbleSortArrayInDescendingOrder() {
        Integer[] inputArray = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        Integer[] outputArray = bubbleSort.sort(inputArray);
        Integer[] expectedOutput = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        assertArrayEquals(outputArray, expectedOutput);
    }

    @Test
    public void bubbleSortLargeArray() {
        Integer[] inputArray = new Integer[1000];
        for (int i = 0; i < 1000; i++) {
            inputArray[i] = (int) (Math.random() * 1000);
        }
        Integer[] outputArray = bubbleSort.sort(inputArray);
        Arrays.sort(inputArray);
        assertArrayEquals(outputArray, inputArray);
    }


    @Test
    public void bubbleSortNullArray() {
        Integer[] inputArray = null;
        assertThrows(NullPointerException.class, () -> {
            bubbleSort.sort(inputArray);
        });
    }


}
