package com.ffzhello.utils;

/**
 * 数组工具类
 * Created by ffzheng on 2018/9/26.
 */
public class ArrayUtils {

    /**
     * 反转byte数组
     * @param arr
     * @return
     */
    public static byte[] reverse(byte[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            byte tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }

    /**
     * 反转char数组
     * @param arr
     * @return
     */
    public static char[] reverse(char[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            char tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }

    public static short[] reverse(short[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            short tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }

    public static int[] reverse(int[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            int tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }

    public static long[] reverse(long[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            long tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }

    public static float[] reverse(float[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            float tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }

    public static double[] reverse(double[] arr) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        int start = 0, end = len - 1;
        while (start < end) {
            double tmp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = tmp;
        }

        return arr;
    }
}
