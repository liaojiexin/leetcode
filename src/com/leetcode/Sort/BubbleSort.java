package com.leetcode.Sort;

/*
冒泡排序:两两遍历，把最大或最小的数字放到最后或者最前面
* */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array=new int[]{2,3,4,1,4,6,2,6,8,3};
        for(int i=0;i<array.length-1;i++){
            for (int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int z=array[j];
                    array[j]=array[j+1];
                    array[j+1]=z;
                }
            }
        }
        for (int i:array) {
            System.out.print(i+" ");
        }
    }
}
