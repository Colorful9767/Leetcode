package com.leetcode.tree;

import Node.TreeNode;

/**
 * @author perl
 * @date 2019/8/27
 * @since 1.0
 */
public class InvertBinaryTree {

    /**
     * LeetCode 226. Invert Binary Tree
     * Level Easy
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode left = invertTree(root.left);
            TreeNode right = invertTree(root.right);

            root.left = right;
            root.right = left;
        }
        return root;
    }
}
