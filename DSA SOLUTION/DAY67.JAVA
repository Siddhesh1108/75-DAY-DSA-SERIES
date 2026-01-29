// /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int m = Math.min(p.val,q.val);
        int n = Math.max(p.val,q.val);
        while(root!=null){
            if(root.val>n){
                root = root.left;
            }
            else if(root.val<m){
                root = root.right;
            }
            else{
                return root;
            }
        }
        return null;
    }
}