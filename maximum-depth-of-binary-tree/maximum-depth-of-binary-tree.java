/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private int max = 0;
    public int maxDepth(TreeNode root) {
        depth(root,1);
        return max;
    }

    public void depth(TreeNode root, int depth){
        if(root == null){
            return;
        }
        depth(root.left, depth+1);
        depth(root.right, depth+1);
        max = Math.max(max,depth);
    }
}