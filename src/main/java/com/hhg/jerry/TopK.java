package com.hhg.jerry;

import java.util.Arrays;

/**
 * Created by lining on 2018/9/21.
 */
public class TopK {

    /**
     * use quick sort, get the top k min -_-
     */
    public static int[] sort(int[] arr, int k) {
        int[] res = new int[k];
        Sort.quick(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    /**
     * use bubble sort, get the top k max -_-
     */
    public static int[] bubble(int[] arr, int k) {
        int[] res = new int[k];
        for (int i = arr.length - 1, r = 0; arr.length - i <= k; i--, r++) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    Helper.swap(arr, j, j + 1);
                }
            }
            res[r] = arr[i];
        }
        return res;
    }

    public static int[] heap(int[] arr, int k){
        int[] arrK = Arrays.copyOfRange(arr, 0, k);
        for (int i = arrK.length / 2 - 1; i >= 0; i--) {
            Helper.adjustHeap(arrK, i, arrK.length);
        }
        for(int i= k;i<arr.length;i++){
            if(arr[i] < arrK[0]){
                arrK[0] = arr[i];
                Helper.adjustHeap(arrK, 0, arrK.length);
            }
        }
        return arrK;
    }
}
