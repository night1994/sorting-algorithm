package com.night.sort.algorithm;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/14 17:03
 * 选择排序
 */
public class SelectSort implements  BaseSort{


    public int[] sort(int[] array) {

        System.out.println("选择排序");
        int temp ;
        //外循环 开始取第一个值开始比较
        for (int i = 0;i < array.length;i++){
            //第一个值作为比较值
            temp = array[i];
            //每次循环开始的第一个值 与后面的比较 最小的 放最前面
            for (int j = i; j < array.length; j++){
                //比较值比当前值 大
                if(temp > array[j]){
                    //当前值作为新的比较值
                    temp = array[j];
                    //原比较值放当前值位置
                    array[j] = array[i];
                    //新的比较值放置首位
                    array[i] = temp;
                }
            }
        }
        return array;
    }
}
