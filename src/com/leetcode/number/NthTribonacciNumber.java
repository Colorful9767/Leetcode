package com.leetcode.number;

/**
 * @author perl
 * @date 2019/8/22
 * @since 1.0
 */
public class NthTribonacciNumber {

    /**
     * 1137. N-th Tribonacci Number
     * The Tribonacci sequence Tn is defined as follows:
     * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
     * Given n, return the value of Tn.
     * Recursive Implement
     * @param n
     * @return
     */
    public static int tribonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("error args!");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
       return tribonacci(n - 3) + tribonacci(n - 2) + tribonacci(n - 1);
    }

    /**
     * Non-recursive Implement
     * @param n
     * @return
     */
    public static int tribonacci2(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("error args!");
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }
        int tn0 = 0;
        int tn1 = 1,tn2 = 1;
        while (n > 2) {
            int sum = tn0 + tn1 + tn2;
            tn0 = tn1;
            tn1 = tn2;
            tn2 = sum;
            n--;
        }
        return tn2;
    }

    /**
     * Test
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(NthTribonacciNumber.tribonacci(4));
        System.out.println(NthTribonacciNumber.tribonacci2(25));
    }
}
