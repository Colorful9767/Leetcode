package com.leetcode.number;

import java.util.Arrays;

/**
 * Created by perl on 2019/7/10.
 *
 * 66. Plus One
 *
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 *
 * Input: [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 */
public class PlusOne {

    public static int[] plusOne(int[] digits) {

        if (digits == null || digits.length == 0) {
            return digits;
        }

        int lastIndex = digits.length - 1;
        //  plus one last digit
        digits[lastIndex] += 1;

        // carry array
        for (int i = lastIndex;i > 0 && digits[i] == 10;i--) {
            digits[i] = 0;
            digits[i -1] += 1;
        }

        if (digits[0] == 10) {
            int[] res = new int[digits.length + 1];
            Arrays.fill(res,0);
            res[0] = 1;
            return res;
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(PlusOne.plusOne(new int[] {9,9,9})));
    }
}
