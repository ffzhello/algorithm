package com.ffzhello.sort;

/**
 * 排序接口，所有排序类都实现该接口
 * Created by ffzheng on 2018/9/22.
 */
public interface Sort {

    /**
     * 字节数组排序
     * @param arr：待排序数组
     * @param pattern:  false(降序)、true(默认升序)
     * @return 排序结果
     */
    public byte[] sort(byte[] arr, boolean pattern);

    public default byte[] sort(byte[] arr) {
        return sort(arr, true);
    }

    /**
     * 字符数组排序
     * @param arr
     * @param pattern
     * @return
     */
    public char[] sort(char[] arr, boolean pattern);

    public default char[] sort(char[] arr) {
        return sort(arr, true);
    }

    /**
     * short数组排序
     * @param arr
     * @param pattern
     * @return
     */
    public short[] sort(short[] arr, boolean pattern);

    public default short[] sort(short[] arr) {
        return sort(arr, true);
    }

    /**
     * int数组排序
     * @param arr
     * @param pattern
     * @return
     */
    public int[] sort(int[] arr, boolean pattern);

    public default int[] sort(int[] arr) {
        return sort(arr, true);
    }

    /**
     * long数组排序
     * @param arr
     * @param pattern
     * @return
     */
    public long[] sort(long[] arr, boolean pattern);

    public default long[] sort(long[] arr) {
        return sort(arr,true);
    }

    /**
     * float数组排序
     * @param arr
     * @param pattern
     * @return
     */
    public float[] sort(float[] arr, boolean pattern);

    public default float[] sort(float[] arr) {
        return sort(arr, true);
    }

    /**
     * double数组排序
     * @param arr
     * @param pattern
     * @return
     */
    public double[] sort(double[] arr, boolean pattern);

    public default double[] sort(double[] arr) {
        return sort(arr,true);
    }
}
