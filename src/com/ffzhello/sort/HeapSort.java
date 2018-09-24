package com.ffzhello.sort;

/**堆排序算法
 * Created by ffzheng on 2018/9/24.
 */
public class HeapSort implements Sort {

    /**
     * 调整堆
     * @param arr
     * @param len
     * @param parent
     * @return
     */
    private byte[] adjust(byte[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            byte tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    /**
     * byte数组排序
     * @param arr：待排序数组
     * @param pattern:  false(降序)、true(升序)
     * @return
     */
    @Override
    public byte[] sort(byte[] arr, boolean pattern) {

        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            byte tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                byte tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    /**
     * @param arr
     * @param len
     * @param parent
     * @return
     */
    private char[] adjust(char[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            char tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    @Override
    public char[] sort(char[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            char tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                char tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    private short[] adjust(short[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            short tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    @Override
    public short[] sort(short[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            short tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                short tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    private int[] adjust(int[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            int tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    @Override
    public int[] sort(int[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            int tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                int tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    private long[] adjust(long[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            long tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    @Override
    public long[] sort(long[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            long tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                long tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    private float[] adjust(float[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            float tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    @Override
    public float[] sort(float[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            float tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                float tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    private double[] adjust(double[] arr, int len, int parent) {
        int child = 2*parent + 1;

        while (child < len) {
            // 找到孩子中最大值
            if (child+1 < len && arr[child] < arr[child+1]) {
                child ++;
            }

            if (arr[parent] >= arr[child])
                break;

            double tmp = arr[parent];
            arr[parent] = arr[child];
            arr[child] = tmp;

            parent = child;
            child = 2*parent + 1;
        }
        return arr;
    }

    @Override
    public double[] sort(double[] arr, boolean pattern) {
        int len = arr.length;
        if (len == 0 || len == 1)
            return arr;

        //从下往上初始堆
        for (int i = len/2; i >= 0; i--) {
            arr = adjust(arr, arr.length, i);
        }

        //调整堆
        for (int j = len-1; j > 0; j--) {
            double tmp = arr[j];
            arr[j] = arr[0];
            arr[0] = tmp;

            arr = adjust(arr, j,0);
        }

        //是否是倒排
        if (!pattern) {
            int start = 0;
            int end = arr.length - 1;
            while (start < end) {
                double tmp = arr[start];
                arr[start++] = arr[end];
                arr[end--] = tmp;
            }
        }

        return arr;
    }

    /**
     * test
     * @param args
     */
    public static void main(String[] args) {
        byte[] arr = {2, 1, 3, 5, 4};
        HeapSort heapSort = new HeapSort();
        arr = heapSort.sort(arr, false);

        for (byte b: arr) {
            System.out.println(b);
        }
    }
}
