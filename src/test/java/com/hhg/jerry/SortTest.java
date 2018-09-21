package com.hhg.jerry;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

/**
 * Created by lining on 2018/9/21.
 */

public class SortTest {

    private int[] arr;
    private final int size = 30000;
    private Long start;

    @Before
    public void before(){
        arr = new int[size];
        Random random = new Random(20);
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(size);
        }
        printShortArr("before sort");
        start = System.currentTimeMillis();
    }

    @After
    public void after(){
        printShortArr("after sort");
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

    public void printShortArr(String msg){
        if(arr.length > 100)
            return;
        System.out.print(msg + ",");
        System.out.print("the arr is :");
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
