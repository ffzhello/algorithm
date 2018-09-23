package com.ffzhello.sort;

/**
 * 简单选择排序
 * Created by ffzheng on 2018/9/22.
 */
public class SimpleSelectSort implements Sort {
    /**
     * @param arr：待排序数组
     * @param pattern:  desc(降序)、asc(升序)
     * @return
     */
    @Override
    public Object[] sort(Object[] arr, String pattern) {

        // verify params
        if (arr == null) {
            return null;
        }

        if (arr.length == 0) {
            return arr;
        }

        //desc
        if (pattern != null && "desc".equals(pattern)) {
            //this.sort(arr);
            Object max ;
            int lenth = arr.length;
            for (int i = 0; i < lenth; i++) {
                max = arr[i];
                for (int j = i + 1; j < lenth; j ++) {

                }

            }

        } else { //asc


        }
        return arr;
    }


}
