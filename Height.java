
public class Height {
        static class Node{
            Node left;
            Node right;
            int data;

            public Node(int data) {
                this.left = null;
                this.right = null;
                this.data = data;
            }
        }
        // public static int Height(Node root){ 
        //     if(root == null) {
        //         return 0;
                
        //     }
        //     int leftHeight = Height(root.left);
        //     int rightHeight = Height(root.right);
        //     int myHeight = Math.max(leftHeight, rightHeight) + 1;
        //     return myHeight;
            
        // }
        // public static int diameter(Node root) {
        //     if(root == null) {
        //         return 0;
                
        //     }
        //     int diam1 = diameter(root.left);
        //     int diam2 = diameter(root.right);
        //     int diam3 = Height(root.left) + Height(root.right) + 1;
        //     return Math.max(diam3, Math.max(diam1, diam2));
        // }
        static class TreeInfo {
          int ht;
          int diam;
          TreeInfo(int ht, int diam) {
            this.ht = ht;
            this.diam = diam;
            
          }
          
        }
        public static TreeInfo diameter2(Node root) {
          if(root == null) {
            return new TreeInfo(0, 0);
          }
          TreeInfo left = diameter2(root. left);
          TreeInfo right = diameter2(root.right);
          int myHeight = Math.max(left.ht, right.ht) + 1;
          int diam1 = left.diam;
          int diam2 = right.diam;
          int diam3 = left.ht + right.ht + 1;
          int mydiam = Math.max(Math.max(diam1, diam2) , diam3);
          TreeInfo myInfo = new TreeInfo(myHeight, mydiam);
          return myInfo;
          
        }
      public static void main(String args[]) {
            Height c = new Height();
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left = new Node(4);
            root.left.right = new Node(5);
            root.right.right=new Node(6);

            System.out.println(diameter2(root).diam);
        }
    }

