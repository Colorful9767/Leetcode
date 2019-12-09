package com.leetcode.stack;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Note that an empty string is also considered valid.
 *
 * Created by perl on 2019-12-09.
 */
public class ValidParentheses {

    public static boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack= new Stack<>();

        for (char c : chars) {
            if (c == '{' || c == '(' || c == '[')
                stack.push(c);
            else if (!stack.isEmpty() && c == '}' && stack.peek() == '{')
                stack.pop();
            else if (!stack.isEmpty() && c == ')' && stack.peek() == '(')
                stack.pop();
            else if (!stack.isEmpty() &&  c == ']' && stack.peek() == '[')
                stack.pop();
            else
                return false;
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String stringArr[] = {"()","()[]{}","(]","([)]","{[]}","(])","","[",")",")}{({))[{{[}"};
        for (String s : stringArr) {
            System.out.println( s +" => " + isValid(s));
        }
    }
}
