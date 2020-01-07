/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
import java.io.*; 
import java.util.ArrayList; 
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        addList(res,temp,root,sum,0);
        return res;
    }
    public void addList(List<List<Integer>> res, ArrayList<Integer> temp, TreeNode root, int sum, int currSum){
        if(root == null)
            return;
        temp.add(root.val);
        if(root.left == null && root.right == null )
        { 
            if(currSum+root.val == sum){
                ArrayList temp2 = new ArrayList(); 
                temp2 = (ArrayList)temp.clone(); 
                res.add(temp2);
            }  
        }
        addList(res,temp,root.left,sum,currSum+root.val);
        addList(res,temp,root.right,sum,currSum+root.val);
        temp.remove(temp.size()-1);
    }
}