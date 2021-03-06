package com.hhg.jerry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by lining on 2018/9/21.
 */

public class SortTest {

    private int[] arr;
    private final int size = 30;
    private Long start;

    @Before
    public void before(){
        arr = TestHelper.constructIntArray(size);
        start = System.currentTimeMillis();
    }

    @After
    public void after(){
        TestHelper.printShortArr(arr, "after sort");
        System.out.println();
    }

    @Test
    public void bubbleTest(){
        Sort.bubble(arr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void chooseTest(){
        Sort.choose(arr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void insertTest(){
        Sort.insert(arr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void quickTest(){
        Sort.quick(arr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
    }

    @Test
    public void heapTest(){
        Sort.heap(arr);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
    }
}
