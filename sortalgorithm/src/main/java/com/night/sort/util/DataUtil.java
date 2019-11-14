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
//        array = new int[]{24,40,65,47,1,87,79,13,49,90,67,62,59,74,10,41,28,58,38,12};
        return array;
    }
}
