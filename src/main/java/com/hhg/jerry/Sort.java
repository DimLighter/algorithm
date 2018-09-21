package com.hhg.jerry;

/**
 * Created by lining on 2018/9/21.
 */
public class Sort {
    public static void bubble(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void choose(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            swap(arr, i, min);
        }
    }

    public static void insert(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && lt(arr, j, j - 1); j--) {
                swap(arr, j, j - 1);
            }
        }
    }

    public static void quick(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right)
            return;
        int i = partition(arr, left, right);
        quickSort(arr, left, i - 1);
        quickSort(arr, i + 1, right);
    }

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
}
