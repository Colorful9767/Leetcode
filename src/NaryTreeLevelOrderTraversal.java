import java.util.*;

/**
 * @author perl
 * @date 2019/8/21
 * @since 1.0
 */
public class NaryTreeLevelOrderTraversal {

    /**
     * 429. N-ary Tree Level Order Traversal
     *
     * Given an n-ary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder(Node root) {
        if (root == null) {
            return new ArrayList<>(0);
        }
        List<List<Integer>> list = new ArrayList<>();
        /* use ArrayDeque */
        Queue<Node> nodeQueue = new ArrayDeque<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            int size = nodeQueue.size();
            List<Integer> nodeList = new ArrayList<>(size);

            for (int i = 0;i < size;i++) {
                Node n = nodeQueue.remove();
                nodeList.add(n.val);

                n.children.forEach(e -> {
                    if (e != null) {
                        nodeQueue.add(e);
                    }
                });
            }
            list.add(nodeList);
        }
        return list;
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {}

        public Node(int _val,List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}
