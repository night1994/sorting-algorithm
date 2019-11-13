package com.night.sort.util;

import java.util.Arrays;
import java.util.Random;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/13 14:05
 */
public class DataUtil {

    /**
     * 生成随机整数
     * @param length
     * @return
     */
    public static int[] getRandomArray(int length){
        int[] array = new int[length];
        for (int i = 0; i< length ; i++){
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }
}
