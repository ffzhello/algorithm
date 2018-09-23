package com.ffzhello.sort;

/**
 * 排序接口，所有排序类都实现该接口
 * 待排序元素必须实现Comparable或Comparator接口
 * Created by ffzheng on 2018/9/22.
 */
public interface Sort {

    /**
     * 排序
     * @param arr：待排序数组
     * @param pattern:  desc(降序)、asc(升序)
     * @return 排序结果
     */
    public Object[] sort(Object[] arr, String pattern);
    /**
     * 默认升序排序
     * @param arr
     * @return
     */
    public default Object[] sort(Object[] arr) {
        return sort(arr, "asc");
    }
}
