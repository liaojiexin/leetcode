package com.leetcode.Sort;

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


class QuickSort1{
    public static void main(String[] args){
        int[] arr={1,5,2,7,3,8};
        sort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

    public static void sort(int[] arr,int left,int right){
        if(left<right){
            int mid=arr[right];	//拿最后一个数作为标准值（这里要注意，如果下边代码先从右边开始找，这里则要那第一个数为标准值，因为从右边开始找会先代替掉第一个值，反之亦然）
            int l=left; 	//第一个数下标
            int r=right;	//最后一个数下标
            //从左边开始找
            while(arr[l]<mid && l<r){	//当左边的值小于标准值并且左边下标小于右边下标则保持不变，然后下标往右边移动
                l++;
            }
            if(l<r){	//当从左边找到大于标准值就会跳出上面的while代码块，然后到这里的代码块
                arr[r]=arr[l];
                r--;
            }
            //从右边开始找
            while(arr[r]>mid && l<r){	//当右边的值大于标准值并且左边下标小于右边下标则保持不变，然后下标往左边移动
                r--;
            }
            if(l<r){	//当从右边找到小于标准值就会跳出上面的while代码块，然后到这里的代码块
                arr[l]=arr[r];
                l++;
            }
            //最后两两下标重叠代表当前这一轮比较结束，把mid值赋值到重叠位置
            arr[l]=mid;
            //迭代下一轮
            sort(arr,left,l-1);
            sort(arr,l+1,right);
        }
    }
}