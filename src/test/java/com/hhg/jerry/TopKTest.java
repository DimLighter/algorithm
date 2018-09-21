package com.hhg.jerry;

import org.junit.Before;
import org.junit.Test;

/**
 * Created by lining on 2018/9/21.
 */
public class TopKTest {
    private int[] arr;
    private final int size = 50;
    private final int k = 6;
    private Long start;

    @Before
    public void before(){
        arr = TestHelper.constructIntArray(size);
        start = System.currentTimeMillis();
    }

    @Test
    public void sortTest(){
        int[] res = TopK.sort(arr,k);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
        TestHelper.printShortArr(res, "after sort");
    }

    @Test
    public void bubbleTest(){
        int[] res = TopK.bubble(arr,k);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
        TestHelper.printShortArr(res, "after sort");
    }

    @Test
    public void heapTest(){
        int[] res = TopK.heap(arr,k);
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() + " duration:" + (System.currentTimeMillis() - start) + "ms");
        TestHelper.printShortArr(res, "after sort");
    }
}
