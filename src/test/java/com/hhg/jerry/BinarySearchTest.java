package com.hhg.jerry;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lina on 2018/9/21.
 */
public class BinarySearchTest {

    private int[] arr;
    private final int size = 30;

    @Before
    public void before() {
        arr = TestHelper.constructIntArray(size);
        Sort.quick(arr);
        TestHelper.printShortArr(arr, "Hi");
    }

    @Test
    public void recursive() {
        for (int i = 0; i < 10; i++) {
            int index = BinarySearch.recursive(arr, i);
            if (index == -1) {
                System.out.println("val " + i + " not found in arr!!!");
            } else {
                Assert.assertTrue(arr[index] == i);
            }
        }
    }

    @Test
    public void iterator() {
        for (int i = 0; i < 10; i++) {
            int index = BinarySearch.iterator(arr, i);
            if (index == -1) {
                System.out.println("val " + i + " not found in arr!!!");
            } else {
                Assert.assertTrue(arr[index] == i);
            }
        }
    }
}
