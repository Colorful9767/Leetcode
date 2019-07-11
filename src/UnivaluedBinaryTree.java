import Node.TreeNode;

/**
 * Created by perl on 2019/7/11.
 *
 * 965. Univalued Binary Tree
 *
 * A binary tree is univalued if every node in the tree has the same value.
 *
 * Return true if and only if the given tree is univalued.
 *
 * Example 1:
 * Input: [1,1,1,1,1,null,1]
 * Output: true
 *
 * Example 2:
 * Input: [2,2,2,5,2]
 * Output: false
 *
 * Note:
 * 1、The number of nodes in the given tree will be in the range [1, 100].
 * 2、Each node's value will be an integer in the range [0, 99].
 */
public class UnivaluedBinaryTree {

    public boolean isUnivalTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        return preOrder(root,root.val);
    }

    private boolean preOrder(TreeNode root, int val) {
        if (root == null) {
            return true;
        }

        if (root.val != val) {
            return false;
        }

        return preOrder(root.left,root.val) && preOrder(root.right,root.val);
    }
}
