package com.night.sort.algorithm;

import com.alibaba.fastjson.JSON;
import com.night.sort.util.DataUtil;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 13:59
 * 冒泡排序
 * 依次比较相邻的两个数，将比较小的数放在前面，比较大的数放在后面。
 */
public class BubbleSort implements BaseSort {

    public  int[] sort(int[] array){

        System.out.println("冒泡排序");
        int temp;
        for (int i = array.length - 1; i >= 0;i--){

            for (int k = 0;k < i ;k++){
                //比较相邻两个数字大小 大的放后面
                 if(array[k] > array[k + 1]){
                    temp = array[k];
                    array[k] = array[k + 1];
                    array[k + 1] = temp;
                 }
            }
        }
        return array;
    }

}
