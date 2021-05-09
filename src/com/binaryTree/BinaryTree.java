package com.binaryTree;

public class BinaryTree {

	public static void main(String[] args) {
	
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.insert(30);
		tree.insert(70);
		
		tree.inorder();	
		
		System.out.println("\nThe size of binary tree is : "+ tree.size());
	}

}

class BinarySearchTree {
	
	 class Node {
   
       int key;
       Node left, right;

       public Node(int key) {
           this.key = key;
           this.left =  null;
           this.right = null;
       }
    }
	
	 Node root = null;
	 
	 public void insert(int key) {
	   
	         root = insertAt(root, key);
	 }
	 
	 public  Node insertAt(Node root, int key) {
	   
		 if (root == null) {
	        
	            root = new Node(key);
	            return root;
	     }
		 if (key < root.key)
	            root.left = insertAt(root.left, key);
	     else if (key > root.key)
	            root.right = insertAt(root.right, key);
		 return root;
	 }
	 
	 public  void inorder()  {
		 
	         inorderAt(root);
	 }
	 
	 public void inorderAt(Node root)  {
	   
	        if (root != null) {
	            inorderAt(root.left);
	            System.out.println(root.key);
	            inorderAt(root.right);
	        }
	 }
	 
	 public int size() {
		 return sizeOf(root);
	 }
	 
	 public int sizeOf(Node root) {
		 if(root == null)
			 return 0;
		 else
			 return(sizeOf(root.left )+1+ sizeOf(root.right));
	 }
	
}