/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return hasSum(root,sum,0);
    }
    public boolean hasSum(TreeNode root,int sum, int currSum){
        if(root == null)
            return false;
        if(root.left == null && root.right == null){
            if(currSum + root.val == sum)
                return true;
            else
                return false;
        }
        return hasSum(root.left,sum,currSum+root.val) || hasSum(root.right,sum,currSum+root.val);
    }
}