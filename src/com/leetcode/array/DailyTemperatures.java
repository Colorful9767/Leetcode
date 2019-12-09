package com.leetcode.array;

import java.util.Arrays;

/**
 * @author perl
 * @date 2019/8/20
 * @since 1.0
 */
public class DailyTemperatures {

    /**
     * 739. Daily Temperatures
     *
     * Given a list of daily temperatures T,
     * return a list such that, for each day in the input,
     * tells you how many days you would have to wait until a warmer temperature.
     * If there is no future day for which this is possible, put 0 instead.
     *
     * For example,
     * given the list of temperatures T = [73, 74, 75, 71, 69, 72, 76, 73],
     * your output should be [1, 1, 4, 2, 1, 1, 0, 0].
     *
     * Note: The length of temperatures will be in the range [1, 30000]. Each temperature will be an integer in the range [30, 100].
     * @param T
     * @return
     */
    public static int[] dailyTemperatures(int[] T) {
        if (T == null || T.length == 0) {
            return null;
        }
        int[] res = new int[T.length];
        for (int i = 0;i < T.length;i++) {
            for (int j = i+1;j < T.length;j++) {
                if (T[j] > T[i]) {
                    res[i] = j - i;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = DailyTemperatures.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73});
        System.out.println(Arrays.toString(res));
    }
}
