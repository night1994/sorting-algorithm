package com.night.sort.test;

import com.alibaba.fastjson.JSON;
import com.night.sort.algorithm.BaseSort;
import com.night.sort.algorithm.BubbleSort;
import com.night.sort.algorithm.QuickSort;
import com.night.sort.algorithm.SelectSort;
import com.night.sort.util.DataUtil;
import org.junit.Test;

/**
 * @author night
 * @version 1.1.0
 * @Date 2019/11/14 17:06
 */
public class TestSort {

    @Test
    public void testSort(){

        BaseSort baseSort = null;
        //冒泡
//        baseSort = new BubbleSort();
        //快速
//        baseSort = new QuickSort();
        //选择
        baseSort = new SelectSort();
        int[] array = DataUtil.getRandomArray(20);
        System.out.println("源数组--->"+ JSON.toJSONString(array));
        baseSort.sort(array);
        System.out.println("排序数组--->"+ JSON.toJSONString(array));
    }
}
