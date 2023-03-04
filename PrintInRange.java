// import java.util.*;

class Node{
	int data;
	Node left, right;
    Node(int data) {
		this.data = data;
		left = right = null;
	}
}
class BinaryTree {
		static Node root;
	void Print(Node node, int X, int Y) {
		if (node == null) {
			return;
		}
		if (X < node.data) {
			Print(node.left, X, Y);
		}
		if (X <= node.data && Y >= node.data) {
			System.out.print(node.data + " ");
		}
		Print(node.right, X, Y);
	}	
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		int X = 6, Y = 10;
		tree.root = new Node(8);
		root.left = new Node(5);
		root.left.right = new Node(6);
	    root.left.left = new Node(3);
		root.left.left.right = new Node(4);
		root.left.left.left=new Node(1);
		root.right=new Node(10);
		root.right.right=new Node(11);
		root.right.right.right=new Node(14);
		tree.Print(root, X, Y);
	}
}
