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
        public boolean findTarget(TreeNode root, int k) {
        Set<Integer> set = new HashSet<>();
        return findNode(root, k ,set);
    }

    public boolean findNode(TreeNode node, int k, Set<Integer> set){
        if(node == null){
            return false;
        }
        if(findNode(node.left,k,set)){
            return true;
        }
        if(set.contains(k-node.val)){
            return true;
        }
        set.add(node.val);
        
        if(findNode(node.right,k,set)){
            return true;
        }

        return false;
    }
}