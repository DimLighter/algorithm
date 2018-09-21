package com.hhg.jerry;

/**
 * Created by lina on 2018/9/21.
 */
public class BinarySearch {

    public static int recursive(int[] arr, int val) {
        return recursiveHelper(arr, 0, arr.length - 1, val);
    }

    private static int recursiveHelper(int[] arr, int low, int high, int val) {
        if (low > high)
            return -1;
        int mid = low + (high - low) / 2;
        if (arr[mid] == val)
            return mid;
        return arr[mid] > val ? recursiveHelper(arr, 0, mid - 1, val) :
                recursiveHelper(arr, mid + 1, high, val);
    }

    public static int iterator(int[] arr, int val) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == val)
                return mid;
            if (arr[mid] > val)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
