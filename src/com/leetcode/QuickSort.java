package com.leetcode;

/*
* 快速排序：找第一个值为标准，然后从右边开始找小于它的，再从左边找大于他的，两两替换，最后等到两边下标重合后再吧第一个值放到重合的位置
* */
public class QuickSort {
    public static void main(String[] args) {
        int[] array=new int[]{1,6,2,7,2,4,8,9,3,0};
        sort(array,0,array.length-1);
        for (int i:array) {
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] array,int left,int right){    //left要做排序的开始下标，right要做排序的结束下标
        if(left<right){
            int i=left,j=right,x=array[i]; //标准数为第一个数字
            while(i<j){
                while(i<j && array[j]>x){  //从右往左找小于标准数的
                    j--;
                }
                if(i<j){
                    array[i]=array[j];
                    i++;
                }
                while (i<j&& array[i]<x){       //从左往右找大于标准数的
                    i++;
                }
                if(i<j){
                    array[j]=array[i];
                    j--;
                }
            }
            array[i]=x;
            sort(array,left,i-1);
            sort(array,i+1,right);
        }
    }
}
