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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
       
        Stack<TreeNode> stack = new Stack<TreeNode>();
        Map<TreeNode,TreeNode> parent = new HashMap<TreeNode, TreeNode>();
        Set<TreeNode> ancestor = new HashSet<TreeNode>();
        parent.put(root, null);
        stack.push(root);
        
        while(!parent.containsKey(p) || !parent.containsKey(q)){
            TreeNode node = stack.pop();
            if(node.left!=null){
                stack.add(node.left);
                parent.put(node.left,node);
            }
            if(node.right!=null){
                stack.add(node.right);
                parent.put(node.right,node);
            }
            
        }
        
        while(p!=null){
            ancestor.add(p);
            p=parent.get(p);
        }
        
        while(!ancestor.contains(q)){
            q=parent.get(q);
        }
        return q;
    }
}