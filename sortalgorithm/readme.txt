冒泡排序原理：
比较相邻的元素。如果第一个比第二个大，就交换他们两个。
对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
针对所有的元素重复以上的步骤，除了最后一个。
持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。

快速排序原理：
取出一个参考数，一般是第一个数，记录参考数坐标,move_index，记录初始起始位置low_index 终止位置:high_index
循环数组，在low < high 的情况下循环下列逻辑：
从数组高位high开始 找出第一个下标小于参考数的数,放置参考数位置
从数组低位low开始 找出第一个下标大于参考数的数，放置high位置
参考数临时放置low位,继续循环，直至low = high
当low == high时  判断参考数是否大于当前low下标数，是，交换两个的位置，此时一轮遍历完毕
此时整个数组以当前参考数位置分隔两部分，前面都是比参考数小的，后面都是比参考数大的
以参考数为分割点，数组分为两部分，递归上面逻辑

选择排序原理：
每次选择最小的数放置首位，循环剩余数组
两轮循环：
每次取外循环第一个值作为比较值，
内循环起始下标为外循环当前下标
每次选出内循环中最小值放置外循环下标处

插入排序原理:
遍历有序数组，将参考值插入适当位置
默认第一个数为有序数组,以第二个数（下标为1）开始，从后往前遍历有序数组
判断有序数组的数是否大于当前比较数，true的情况下，有序数组当前比较数下标后移一位
false的情况下，插入当前比较值