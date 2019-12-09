package com.leetcode.array;

import java.util.Arrays;

/**
 * Created by perl on 2019/7/16.
 *
 * 922. Sort Array By Parity II
 *
 * Given an array A of non-negative integers, half of the integers in A are odd, and half of the integers are even.
 *
 * Sort the array so that whenever A[i] is odd, i is odd; and whenever A[i] is even, i is even.
 *
 * You may return any answer array that satisfies this condition.
 *
 * Example 1:
 * Input: [4,2,5,7]
 * Output: [4,5,2,7]
 * Explanation: [4,7,2,5], [2,5,4,7], [2,7,4,5] would also have been accepted.
 *
 * Note:
 *
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 */
public class SortArrayByParityII {

    public static int[] sortArrayByParityII(int[] A) {
        if (A == null || A.length == 0 || isOdd(A.length)) {
            return null;
        }

        for (int i = 0;i < A.length;i++) {
            if (isEven(A[i]) && isOdd(i)) {
                for (int j = i + 2;j < A.length;j+=2) {
                    if (isOdd(A[j])) {
                        swap(A,i,j);
                        break;
                    }
                }
            }
            if (isOdd(A[i]) && isEven(i)) {
                for (int j = i + 1;j < A.length;j++) {
                    if (isEven(A[j])) {
                        swap(A,i,j);
                        break;
                    }
                }
            }
        }
        return A;
    }

    private static boolean isOdd(int a) {
        return a % 2 != 0;
    }

    private static boolean isEven(int a) {
        return !isOdd(a);
    }

    private static void swap(int[] arr,int a,int b) {
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(SortArrayByParityII.sortArrayByParityII(new int[]{4,2,5,7})));
    }
}
