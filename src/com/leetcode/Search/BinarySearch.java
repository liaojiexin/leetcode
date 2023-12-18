package com.leetcode.Search;


//二分查找,从一个整数数组中找出某个整数的下标，没有则返回-1
public class BinarySearch {
    public static void main(String[] args) {
        int[] array=new int[]{1,2,3,4,5,6,7,8,9};  //整数
        int a=10;  //要找的整数
        int index=BinarySearch(a,array,0,array.length-1);
        System.out.println("整数a的下标为："+index);
    }

    public static int BinarySearch(int a, int[] array, int left, int right){
        if(left<=right){
            int v=(left+right)/2;  //中间标志位
            if(a==array[v])
            {
                return v+1;
            }else if (a>array[v]){
                return BinarySearch(a,array,v+1,array.length-1);
            }else if(a<array[v]){
                return BinarySearch(a,array,0,v-1);
            }
            return -1;
        }else
            return -1;
    }
}
