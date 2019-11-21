/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Queue<Node> q=new LinkedList<Node>();
        if(root == null)
            return null;
        q.add(root);
        
        int count = 0;
        int i=1;
        while(!q.isEmpty()){
            Node temp=q.poll();
            //System.out.println(temp.val);
            if(Math.pow(2,count) == i){
                //System.out.println(temp.val);
                temp.next=null;
                i=1;
                count++;
            }
            else{
                
                temp.next = q.peek();
                i++;
            }
            if(temp.left!=null)
                q.add(temp.left);
            if(temp.right!=null)
                q.add(temp.right);
        }
         return root;
    }
   
}