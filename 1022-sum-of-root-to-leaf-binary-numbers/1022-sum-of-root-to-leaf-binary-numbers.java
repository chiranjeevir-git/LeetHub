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
    
    public void sumRootToLeaf(TreeNode root, String binaryDigit, ArrayList<String> listOfBinary){
        
        if(root==null)
            return;
            
        if(root.left==null && root.right==null){
            listOfBinary.add(binaryDigit+root.val);
            return;
        }
        
        
        sumRootToLeaf(root.left, binaryDigit+root.val,listOfBinary );
        sumRootToLeaf(root.right, binaryDigit+root.val,listOfBinary );
        
    }
    
    public int sumRootToLeaf(TreeNode root) {
        if(root.left==null && root.right==null)
            return root.val;
        
        ArrayList<String> listOfBinary = new ArrayList<>();
        sumRootToLeaf(root, "", listOfBinary);
        
        return listOfBinary.stream().mapToInt(s->Integer.parseInt(s, 2)).sum();
    }
}