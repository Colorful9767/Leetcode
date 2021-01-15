package com.leetcode.array;

import java.util.Arrays;

/**
 * Given a non-empty array of decimal digits representing a non-negative integer, increment one to the integer.
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contains a single digit.
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 *
 * Example 2:
 *
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 *
 * Example 3:
 *
 * Input: digits = [0]
 * Output: [1]
 */
public class PlusOne {

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();
        System.out.println("Example 1:");
        System.out.printf("Input: digits = %s%n", printResult(new int[] {1,2,3}));
        System.out.printf("Output: %s%n", printResult(plusOne.plusOne(new int[] {1,2,3})));
        System.out.println("Example 2:");
        System.out.printf("Input: digits = %s%n", printResult(new int[] {4,3,2,1}));
        System.out.printf("Output: %s%n", printResult(plusOne.plusOne(new int[] {4,3,2,1})));
        System.out.println("Example 3:");
        System.out.printf("Input: digits = %s%n", printResult(new int[] {0}));
        System.out.printf("Output: %s%n", printResult(plusOne.plusOne(new int[] {0})));
    }

    // 思路: 从最后一位判断是否需要进位， 如果不需要直接最后一位加一返回即可
    // 如果需要进位 本位置为0 下一位继续判断 以此类推
    // 如果循环结束还没返回表示需要借位 如999+1这种情况
    // 此时只需要重新生成一个比当前数组多一位的数组
    // 并将首位赋值为1返回即可 此时除了首位以外应该全为0
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1;i >= 0;i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }

    public static String printResult(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        Arrays.stream(arr).forEach(e -> sb.append(e).append(","));
        return sb.substring(0, sb.length() - 1) + "]";
    }
}
