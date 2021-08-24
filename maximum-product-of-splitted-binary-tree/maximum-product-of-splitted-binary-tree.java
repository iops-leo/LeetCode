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
    private long totalSum = 0;
    private long result = 0;
    public int maxProduct(TreeNode root) {
        dfs(root);
        cal(root);
        return (int)(result % ((int)Math.pow(10,9)+7));

    }

    public void dfs(TreeNode root){
        if(root == null) {
            return;
        }
        dfs(root.left);
        dfs(root.right);
        totalSum += (long)root.val;
    }

    public long cal(TreeNode root){
        if(root == null) {
            return 0;
        }
        long l = cal(root.left);
        long r = cal(root.right);
        long subTreeSum = root.val+l+r;
        result = Math.max(result, (subTreeSum) * (totalSum - subTreeSum));
        return subTreeSum;
    }
}