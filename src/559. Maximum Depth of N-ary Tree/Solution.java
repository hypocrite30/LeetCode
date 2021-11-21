import java.util.*;

/* 559. Maximum Depth of N-ary Tree */
public class Solution {
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int res = 0;
        for (Node child : root.children) {
            res = Math.max(res, maxDepth(child));
        }
        return res + 1;
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}