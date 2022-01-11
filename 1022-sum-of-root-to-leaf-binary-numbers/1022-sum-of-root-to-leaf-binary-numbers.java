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
    int ans=0;
    public void sumRootToLeaf(TreeNode root, int val){
        
        if(root==null)
            return;
            
        if(root.left==null && root.right==null){
            val = val<<1|root.val;
            ans=ans+val;
            return;
        }
        
        val = val<<1|root.val;
        sumRootToLeaf(root.left, val );
        sumRootToLeaf(root.right, val );
        
    }
    
    public int sumRootToLeaf(TreeNode root) {
        
        if(root.left==null && root.right==null)
            return root.val;
        
        sumRootToLeaf(root,0);
        
        return ans;
    }
}