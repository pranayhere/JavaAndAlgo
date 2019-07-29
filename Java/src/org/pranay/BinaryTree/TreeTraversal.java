package org.pranay.BinaryTree;

public class TreeTraversal {
	static Node root;
	void printPreorder(Node node) {
		if(node == null)
			return;
		System.out.print(" "+node.data);
		printPreorder(node.left);
		printPreorder(node.right);
	}
	
	void printInorder(Node node) {
		if(node == null)
			return;
		printInorder(node.left);
		System.out.print(" "+node.data);
		printInorder(node.right);
	}
	
	void printPostorder(Node node) {
		if(node == null)
			return;
		printPostorder(node.left);
		printPostorder(node.right);
		System.out.print(" "+node.data);
	}
	
	public static void main(String[] args) {
		TreeTraversal tree = new TreeTraversal();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
 
       System.out.print("preorder : ");
       tree.printPreorder(root);
       System.out.println();
       
       System.out.print("inorder : ");
       tree.printInorder(root);
       System.out.println();
       
       System.out.print("postorder : ");
       tree.printPostorder(root);
       System.out.println();
	}
}
