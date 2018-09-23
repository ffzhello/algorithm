package com.ffzhello.sort;

/**
 * 简单选择排序
 * Created by ffzheng on 2018/9/22.
 */
public class SimpleSelectSort implements Sort {
    private static SimpleSelectSort simpleSelectSort = null;

    private SimpleSelectSort() {

    }

    public static SimpleSelectSort getInstance() {
        if (simpleSelectSort == null)
            simpleSelectSort = new SimpleSelectSort();

        return simpleSelectSort;
    }

    /**
     * @param arr：待排序数组
     * @param pattern:  false(降序)、true(升序)
     * @return
     */
    @Override
    public byte[] sort(byte[] arr, boolean pattern) {

        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            byte max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                byte tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
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

    /**
     * @param arr
     * @param pattern
     * @return
     */
    @Override
    public char[] sort(char[] arr, boolean pattern) {
        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            char max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                char tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                char tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        return arr;
    }

    /**
     * @param arr
     * @param pattern
     * @return
     */
    @Override
    public short[] sort(short[] arr, boolean pattern) {
        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            short max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                short tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                short tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        return arr;
    }

    @Override
    public int[] sort(int[] arr, boolean pattern) {
        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            int max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                int tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                int tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        return arr;
    }

    /**
     * @param arr
     * @param pattern
     * @return
     */
    @Override
    public long[] sort(long[] arr, boolean pattern) {
        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            long max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                long tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                long tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }
        return arr;
    }

    /**
     * @param arr
     * @param pattern
     * @return
     */
    @Override
    public float[] sort(float[] arr, boolean pattern) {
        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            float max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                float tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                float tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        return arr;
    }

    /**
     * @param arr
     * @param pattern
     * @return
     */
    @Override
    public double[] sort(double[] arr, boolean pattern) {
        int len = arr.length;
        if (len  == 0 || len == 1)
            return arr;

        for (int i = 0; i < len; i ++) {
            double max = arr[i];
            int pos = i;
            //find the max value
            for (int j = i + 1; j < len; j ++) {
                if (arr[j] < max) {
                    max = arr[j];
                    pos = j;
                }
            }
            //replace arr[i] with arr[pos]
            if (pos != i) {
                double tmp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = tmp;
            }
        }

        //如果降序,反转数组
        if (!pattern) {
            int start = 0, end = len - 1;
            while (start < end) {
                double tmp = arr[start];
                arr[start] = arr[end];
                arr[end] = tmp;
            }
        }
        return arr;
    }

    /**
     * main test
     * @param args
     */
    public static void main(String[] args) {

        long[] arr = {2, 3, 4, 1, 5};
        SimpleSelectSort simpleSelectSort = SimpleSelectSort.getInstance();
        arr = simpleSelectSort.sort(arr);

        System.out.println("升序：");
        for (long b: arr) {
            System.out.println(b);
        }

        System.out.println("降序：");
        arr = simpleSelectSort.sort(arr, false);
        for (long b: arr) {
            System.out.println(b);
        }
    }
}
