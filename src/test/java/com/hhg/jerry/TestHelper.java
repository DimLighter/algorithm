package com.hhg.jerry;

import java.util.Random;

/**
 * Created by lining on 2018/9/21.
 */
public class TestHelper {

    public static int[] constructIntArray(int size){
        int[] arr = new int[size];
        Random random = new Random(20);
        for(int i=0;i<arr.length;i++){
            arr[i] = random.nextInt(size);
        }
        printShortArr(arr, "before sort");
        return arr;
    }

    public static void printShortArr(int[] arr, String msg){
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
