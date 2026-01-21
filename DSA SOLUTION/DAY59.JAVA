// Left View of Binary Tree(GFG)
// Given the root of a binary tree. Your task is to return the left view of the binary tree. The left view of a binary tree is the set of nodes visible when the tree is viewed from the left side.
// Note: If the tree is empty, return an empty list.
// Examples :

// Input: root = [1, 2, 3, 4, 5, N, N] 
//  Output:[1, 2, 4]
// Explanation: From the left side of the tree, only the nodes 1, 2, and 4 are visible.

// Input: root = [1, 2, 3, N, N, 4, N, N, 5, N, N]
//  Output: [1, 2, 4, 5]
// Explanation: From the left side of the tree, only the nodes 1, 2, 4, and 5 are visible.

// Constraints:
// 0 ≤ number of nodes ≤ 105
// 0 ≤ node -> data ≤ 105

/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/

class Solution {
    public ArrayList<Integer> leftView(Node root) {
        ArrayList<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int size = q.size();

            for (int i = 0; i < size; i++) {
                Node curr = q.poll();

                
                if (i == 0) {
                    result.add(curr.data);
                }

                if (curr.left != null) q.add(curr.left);
                if (curr.right != null) q.add(curr.right);
            }
        }
        return result;
    }
}
