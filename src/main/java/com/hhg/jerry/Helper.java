package com.hhg.jerry;

/**
 * Created by lining on 2018/9/21.
 */
public class Helper {
    public static int partition(int[] arr, int left, int right) {
        int mid = arr[left];
        while (left < right) {
            while (left < right && arr[right] >= mid) {
                right--;
            }
            swap(arr, left, right);
            while (left < right && arr[left] <= mid) {
                left++;
            }
            swap(arr, left, right);
        }
        return left;
    }

    public static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static boolean lt(int[] arr, int i, int j) {
        return arr[i] < arr[j];
    }

    public static void adjustHeap(int[] arr, int i, int length) {
        int tmp = arr[i];
        for (int k = 2 * i + 1; k < length; k = 2 * k + 1) {
            if (k + 1 < length && arr[k] < arr[k + 1]) {
                k++;
            }
            if (arr[k] > tmp) {
                arr[i] = arr[k];
                i = k;
            } else
                break;
        }
        arr[i] = tmp;
    }
}
