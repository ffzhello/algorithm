package com.ffzhello.sort;

/**
 * Created by ffzheng on 2018/9/26.
 */
public class DirectInsertSort implements Sort {

    @Override
    public byte[] sort(byte[] arr, boolean pattern) {

        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        for (int i = 1; i < len; i++) {
            byte tmp = arr[i];
            for (int k = i-1; k >= 0; k--) {
                if (tmp > arr[k]) {
                    for (int index = i; index > k; index--) {
                        arr[index] = arr[index-1];
                    }
                    arr[k+1] = tmp;
                    break;
                }
            }
        }

        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                byte tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }

        return arr;
    }

    @Override
    public char[] sort(char[] arr, boolean pattern) {
        return new char[0];
    }

    @Override
    public short[] sort(short[] arr, boolean pattern) {
        return new short[0];
    }

    @Override
    public int[] sort(int[] arr, boolean pattern) {
        return new int[0];
    }

    @Override
    public long[] sort(long[] arr, boolean pattern) {
        return new long[0];
    }

    @Override
    public float[] sort(float[] arr, boolean pattern) {
        return new float[0];
    }

    @Override
    public double[] sort(double[] arr, boolean pattern) {
        return new double[0];
    }

    public static void main(String[] args) {
        byte[] b = {'a', 'c', 'e', 'b'};
        DirectInsertSort directInsertSort = new DirectInsertSort();
        b = directInsertSort.sort(b);
        for (byte bb: b)
            System.out.println(bb);
    }
}
