package com.leetcode.Sort;

import java.util.Arrays;

/**
 * 归并排序：归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，
 * 即把待排序序列分为若干个子序列，每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
 */

public class MergeSort {

    public static void main(String[] args) throws Exception {
        int[] sourceArray={1,3,4,1,2,5,6,8,3};
        int[] arr=sort(sourceArray);
        for (int i:arr) {
            System.out.print(i+" ");
        }
    }


    public static int[] sort(int[] sourceArray) throws Exception {
        // 对 arr 进行拷贝，不改变参数内容
        int[] arr = Arrays.copyOf(sourceArray, sourceArray.length);

        if (arr.length < 2) {
            return arr;
        }
        int middle = (int) Math.floor(arr.length / 2);

        int[] left = Arrays.copyOfRange(arr, 0, middle);
        int[] right = Arrays.copyOfRange(arr, middle, arr.length);

        return merge(sort(left), sort(right));
    }

    protected static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length]; //创建一个新数组用于存放排好序后的数据
        int i = 0;
        while (left.length > 0 && right.length > 0) {
            if (left[0] <= right[0]) {      //如果右边数组的第一个数大于左边数组第一个数
                result[i++] = left[0];      //把小的数字(即左边数组第一个数)放入到新数组result中
                left = Arrays.copyOfRange(left, 1, left.length);    //left变成没有第一个数的新数组
            } else {        //反之亦然
                result[i++] = right[0];
                right = Arrays.copyOfRange(right, 1, right.length);
            }
        }

        //下面处理剩余数据，因为左右两数组长度不一样，上面的代码操作后可能会有一边的数组还剩余数组
        while (left.length > 0) {
            result[i++] = left[0];
            left = Arrays.copyOfRange(left, 1, left.length);
        }

        while (right.length > 0) {
            result[i++] = right[0];
            right = Arrays.copyOfRange(right, 1, right.length);
        }

        return result;
    }

}
