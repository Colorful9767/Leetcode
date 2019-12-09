package com.leetcode.tree;

import Node.TreeNode;

/**
 * Created by perl on 11/7/19.
 *
 * 814. Binary Tree Pruning
 *
 * We are given the head node root of a binary tree, where additionally every node's value is either a 0 or a 1.
 * Return the same tree where every subtree (of the given tree) not containing a 1 has been removed.
 * (Recall that the subtree of a node X is X, plus every node that is a descendant of X.)
 */
public class BinaryTreePruning {

    public TreeNode pruneTree(TreeNode root) {
        pruneTreeChild(root);
        return root;
    }

    private void pruneTreeChild (TreeNode root) {
        if (root == null) {
            return;
        }
        if (root.left != null) {
            pruneTreeChild(root.left);
        }
        if (root.right != null) {
            pruneTreeChild(root.right);
        }
        if (root.left != null && root.left.left == null && root.left.right == null && root.left.val == 0) {
            root.left = null;
        }
        if (root.right != null && root.right.left == null && root.right.right == null && root.right.val == 0){
            root.right = null;
        }
    }
}
