public class BST1 {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            left=null;
            right=null;
        }
    }
    /**
     * @param root
     * @param val
     * @return 
     */
    static BST1.Node insert(Node root, int val){
        if(root==null){
            root=new Node(val);
        }
        return root;
    }
}