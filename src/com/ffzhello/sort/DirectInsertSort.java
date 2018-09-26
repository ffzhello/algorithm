package com.ffzhello.sort;

import com.ffzhello.utils.ArrayUtils;

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

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                byte tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    @Override
    public char[] sort(char[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                char tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    @Override
    public short[] sort(short[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                short tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    @Override
    public int[] sort(int[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                int tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    @Override
    public long[] sort(long[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                long tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    @Override
    public float[] sort(float[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                float tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    @Override
    public double[] sort(double[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1) {
            return arr;
        }

        int i, j, k;

        for (i = 1; i < len; i++) {
            for (j = i-1; j >= 0; j--) {
                if (arr[j] < arr[i])
                    break;
            }

            if (j != i-1) {
                double tmp = arr[i];
                for (k = i - 1; k > j; k--)
                    arr[k+1] = arr[k];

                arr[k+1] = tmp;
            }
        }

        //是否倒排
        return pattern? arr: ArrayUtils.reverse(arr);
    }

    public static void main(String[] args) {
        byte[] b = {'a', 'c', 'e', 'b'};
        DirectInsertSort directInsertSort = new DirectInsertSort();
        b = directInsertSort.sort(b);
        for (byte bb: b)
            System.out.println(bb);

        double[] d = {3.1, 2.2, 4, 0.1};
        d = directInsertSort.sort(d);
        for (double dd: d)
            System.out.println(dd);
    }
}
