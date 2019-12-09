package com.leetcode.array;

/**
 * Created by perl on 2019/7/5.
 *
 * 1. Two Sum
 *
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *  Given nums = [2, 7, 11, 15], target = 9,
 *  Because nums[0] + nums[1] = 2 + 7 = 9,
 *  return [0, 1].
 */
public class TwoSum {

    public static int[] solution(int[] nums, int target) {
        for (int i=0;i<nums.length;i++){
            int tmp = target - nums[i];
            for (int j=0;j<nums.length;j++){
                if (i!=j && tmp == nums[j]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {0,0};
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] res = solution(nums,target);
        System.out.println("[" + res[0] + "," + res[1] + "]");
    }
}
