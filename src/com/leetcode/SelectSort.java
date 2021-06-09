package com.leetcode;

/*
选择排序：每次选择最前面的数字为最小值，然后依次和后面的比较，如果后面有比它小的话就调换两者的值，对后面的数字再重复前面的操作
* */
public class SelectSort {
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
