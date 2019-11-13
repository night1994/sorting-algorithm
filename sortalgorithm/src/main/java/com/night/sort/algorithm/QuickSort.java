package com.night.sort.algorithm;

import com.alibaba.fastjson.JSON;
import com.night.sort.util.DataUtil;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 14:54
 */
public class QuickSort {


    public static void quick(int[] array , int low, int high){

        if(high <= 0 || low >= array.length -1 ){
            return ;
        }
        //获取参考数
        int temp = array[low];
        int low_init_index = low;
        int high_init_index = high;
        low = low + 1;
        int begin_low = low;
        int begin_high = high;
        while(low < high){
            //从后往前找第一个比参考数小的
            while(low < high && array[high] > temp){
                high--;
            }
            //从前往后找第一个比参考数大的
            while (low < high && array[low] < temp){
                low ++;
            }
            if(low < high){
                array[low_init_index] = array[high];
                array[high] = array[low];
                low_init_index = low;
                array[low] = temp;
                low++;
                high--;
            }
        }
        System.out.println("一次组--->"+ JSON.toJSONString(array));
        quick(array,begin_low ,low - 1);
        quick(array,low + 1,begin_high );

    }

    public static void main(String[] args) {
        int[] array = DataUtil.getRandomArray(20);
        System.out.println("源数组--->"+ JSON.toJSONString(array));
        quick(array,0,array.length - 1);
        System.out.println("排序数组--->"+ JSON.toJSONString(array));
    }
}
