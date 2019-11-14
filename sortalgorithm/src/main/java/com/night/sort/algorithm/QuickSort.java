package com.night.sort.algorithm;

import com.alibaba.fastjson.JSON;
import com.night.sort.util.DataUtil;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 14:54
 * 快速排序
 */
public class QuickSort implements BaseSort {


    public  void quick(int[] array, int low, int high) {

        //起始位置与终止位置 一致  停止
       if(low >= high){
           return ;
       }
       //第一个数字作为参考数
       int temp = array[low];
       //记录初始开始位置
        int low_index = low;
        //记录初始结束位置
        int high_index = high;
        //记录参考数移动坑位
        int move_index = low;
       while(low < high){
            //从高位开始找出第一个小于参考数的数
           while (low < high && array[high] >= temp){
               high--;
           }
           //从低位开始找出第一个大于参考数的数
           while (low < high && array[low] <= temp){
               low++;
           }
           //下标未交叉 交换高位填坑 低位填高位 低位变为新坑
            if(low < high){
                array[move_index] = array[high];
                array[high] = array[low];
                array[low] = temp;
                move_index = low;
            }

            //下标交叉 判断交叉点是否比参考数大  比参考数大 交换位置
            if(low == high && temp > array[low]){
                array[move_index] = array[low];
                array[low] = temp;
            }
       }

       quick(array,low_index,low - 1);
       quick(array,low + 1,high_index);
    }

    public int[] sort(int[] array) {
        System.out.println("快速排序");
        quick(array,0,array.length - 1);
        return array;
    }
}
