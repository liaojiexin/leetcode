package com.leetcode;


/*希尔排序：
1、选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
2、按增量序列个数k，对序列进行k 趟排序；
3、每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。
仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
* */
public class ShellSort {
    public static void main(String[] args) {
        int[] array=new int[]{4,2,6,8,2,1,6,8,9};
        for(int inc=array.length/2;inc>0;inc/=2){   //全部要比较的轮数，例如第一轮是两两比较，第二轮是44比较
            for(int i=0;i<inc;i++){     //inc为每轮要比较的次数，如例子中9个数字第一轮中，第一次比较是第一个数字和第五个数字比较
                //接下来用插入排序
                for(int j=i+inc;j<array.length;j=j+inc){
                    int x=array[i];
                    int z=j-inc;
                    while(z>=0 && array[z]>x){
                        array[z+inc]=array[z];
                        z=z-inc;
                    }
                    array[z+inc]=x;
                }
            }
        }
        for (int i:array) {
            System.out.print(i+" ");
        }
    }
}
