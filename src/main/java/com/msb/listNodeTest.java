package com.msb;

class Solution {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * 将给定数组排序
     *
     * @param arr int整型一维数组 待排序的数组
     * @return int整型一维数组
     */
    public int[] MySort(int[] arr) {
        // write code here
//         return popSort(arr);
        return selectSort(arr);
    }

    /* 冒泡排序 */
    private int[] popSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int a = arr[i];
                    arr[i] = arr[j];
                    arr[j] = a;
                }
            }
        }
        return arr;
    }

    /* 选择排序 */
    private int[] selectSort(int[] arr) {

        int begin = 0;
        int end = arr.length - 1;
        while (begin < end) {
            int minIndex = begin;
            int maxIndex = begin;
            for (int i = begin; i <= end; i++) {
                if (arr[i] <= arr[minIndex]) {
                    minIndex = i;
                }
                if (arr[i] >= arr[maxIndex]) {
                    maxIndex = i;
                }
            }
            int a = arr[begin];
            arr[begin] = arr[minIndex];
            arr[minIndex] = a;
            if (maxIndex == begin) {
                maxIndex = minIndex;
            }
            int b = arr[end];
            arr[end] = arr[maxIndex];
            arr[maxIndex] = b;

            begin++;
            end--;
        }
        return arr;
    }
}