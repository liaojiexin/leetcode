package com.leetcode.Sort;


/*
插入排序：从第2个数字开始依次和前面的有序数据进行比较，然后选择合适的位置插入
* */
public class InsertSort {
    public static void main(String[] args) {
        int[] array=new int[]{4,5,2,7,8,9,1,6};
        for (int i=1;i<array.length;i++){       //全部要比较的次数，从1开始是因为第一个数不用比较
            int x=array[i];
            int j=i-1;
            while(j>=0 && x<array[j]){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=x;
        }
        for (int i:array) {
            System.out.print(i+" ");
        }
    }
}
