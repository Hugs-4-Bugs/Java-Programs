import java.util.* ;
public class BST{
  static class Node{
    int data;
    Node left;
    Node right;
    
    // constructor (used to initialize the object)
    Node(int data){
      this.data=data;
      left=null;
      right=null;
    }
  }
  public static Node insert(Node root, int val){
    if(root==null){
      root=new Node(val);
      return root;
    }
    if(root.data>val){
      root.left=insert(root.left, val);
    }else{
      root.right=insert(root.right, val);
    }
    return root;
  }
  
  public static void Inorder(Node root){
    if(root==null){
      return;
    }
    Inorder(root.left);
    System.out.print(root.data+ " ");
    Inorder(root.right);
  }
 
  public static void printInRange(Node root, int X, int Y){
    if(root==null){
      return;
    }
    if(root.data>=X && root.data<=Y){
      printInRange(root.left, X,Y);
      System.out.println(root.data+ " ");
      printInRange(root.right, X,Y);
    }
    else if(root.data>=Y){
      printInRange(root.left, X,Y);
    }
    else{
      printInRange(root.right, X,Y);
    }
  }
  public static void printPath(ArrayList<Integer> path){
    for(int i=0; i<path.size(); i++){
      System.out.print(path.get(i)+ "->");
    }
    System.out.println() ;
  }
  public static void printRoot2Leaf(Node root,  ArrayList<Integer> path){
    if(root == null) {
      return;
      }
      path.add(root.data);
      //leaf
      if(root.left == null && root.right == null) {
      printPath(path);
      } else  //non-leaf

   // preorder traversal
    printRoot2Leaf(root.left, path);
    printRoot2Leaf(root.right, path);

   // Jisko add kiya usko remove karne k liye 👇
    path.remove(path.size()-1); // we'll remove because we are going to do backtracking
      
  }
   public static boolean search(Node root, int key){
    if(root==null){
      return false;
    }
    if(root.data>key){
      return search(root.left, key);
    }
    else if(root.data==key){
    return true;
   }
   else{
    return search(root.right, key);
   }
  }
  public static Node delete(Node root, int val){
    if(root==null){
      return root;
    }
    if(root.data>val){
      root.left=delete(root.left, val);
    }
    else if(root.data<val){
      root.right=delete(root.right, val);
    } else{  // root.data=val
      // case 1 -> no child
      if(root.left==null && root.right==null){
        return null;
      }
      // case 2 -> one child
      if(root.left==null){
        return root.right;
      }
      else if(root.right==null){
        return root.left;
      }
      // case 3 -> two child
      Node IS = inorderSuccessor(root.right);
      root.data=IS.data;
      root.right=delete(root.right, IS.data);
    }
    return root;
    }
    public static Node inorderSuccessor(Node root){
      while(root.left!=null){
        root=root.left;
      }
      return root;
    }
  public static void main(String args[]){
    int values[]={8,5,3,6,10,11,14};
    Node root=null;
    for(int i=0; i<values.length;i++){
      root=insert(root,values[i]);
    }
    Inorder(root);  // to print the values in increasing order
    System.out.println();

    // to search the element in the binary tree
    // if(search(root, 1)){
    //   System.out.println("found");
    // } else{ 
    //   System.out.println("not found");
    // }
     // to delete the node from the binary tree
     
    // printRoot2Leaf(root, new ArrayList<>());  // to print from root to leaf
    delete(root, 6);
    Inorder(root);  // used to print the inorder value after the deletion of the node in binary tree
  }

}