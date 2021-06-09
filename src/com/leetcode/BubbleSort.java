package com.leetcode;

/*
冒泡排序：每次遍历找出最大或最小的数字，把最大或最小的数字放到最后或最前面
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array=new int[]{1,6,2,6,3,4,7,9,1,5};
        for(int i=0;i<array.length;i++){
            for (int j=i+1;j<array.length;j++){
                if (array[i]>array[j])
                {
                    int z=array[i];
                    array[i]=array[j];
                    array[j]=z;
                }
            }
        }
        for (int i:array){
            System.out.print(i+" ");
        }
    }
}
