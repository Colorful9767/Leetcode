package com.leetcode.number;

/**
 * 1281. Subtract the Product and Sum of Digits of an Integer
 * Given an integer number n, return the difference between the product of its digits and the sum of its digits.
 *
 * Example 1:
 * Input: n = 234
 * Output: 15
 * Explanation:
 * Product of digits = 2 * 3 * 4 = 24
 * Sum of digits = 2 + 3 + 4 = 9
 * Result = 24 - 9 = 15
 *
 * Example 2:
 * Input: n = 4421
 * Output: 21
 * Explanation:
 * Product of digits = 4 * 4 * 2 * 1 = 32
 * Sum of digits = 4 + 4 + 2 + 1 = 11
 * Result = 32 - 11 = 21
 *
 * Created by perl on 2019-12-13.
 */
public class SubtractProductSumDigitsInteger {

    public int subtractProductAndSum(int n) {
        int plus = 0, muti = 1;

        while (n > 0) {
            plus += n % 10;
            muti *= n % 10;
            n /= 10;
        }

        return muti - plus;
    }

    public static void main(String[] args) {
        SubtractProductSumDigitsInteger subtractProductSumDigitsInteger = new SubtractProductSumDigitsInteger();
        int res = subtractProductSumDigitsInteger.subtractProductAndSum(114);
        System.out.println(res);
    }
}
