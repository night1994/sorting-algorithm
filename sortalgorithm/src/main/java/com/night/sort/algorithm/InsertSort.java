package com.night.sort.algorithm;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/14 17:30
 * 插入排序
 */
public class InsertSort implements BaseSort {

    public int[] sort(int[] array) {

        int temp;
        //这里1 开始 是因为插入排序需要一个有序数组 默认使用第一个作为有序数组
        for (int i = 1;i<array.length ;i++){

            //记录当前插入值
            temp = array[i];

            int j = i;
            //从当前值开始遍历 判断是否比参考值 大 是的情况下 所有坐标后移一位
            while (j > 0 && array[j - 1] > temp){
                array[j] = array[j - 1];
                j--;
            }
            //最终坐标插入值
            array[j] = temp;
        }
        return array;
    }
}
