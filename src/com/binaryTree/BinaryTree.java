package com.binaryTree;

public class BinaryTree {

	public static void main(String[] args) {
	
		BinarySearchTree tree = new BinarySearchTree();
		tree.insert(56);
		tree.insert(30);
		tree.insert(22);
		tree.insert(11);
		tree.insert(3);
		tree.insert(16);
		tree.insert(40);
		tree.insert(70);
		tree.insert(60);
		tree.insert(65);
		tree.insert(63);
		tree.insert(67);
		tree.insert(95);
		
		tree.inorder();	
		
		System.out.println("\nThe size of binary tree is : "+ tree.size());
		
		System.out.println("\nThe given Key exist in the binary tree : "+ tree.search(63));
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
			 return(sizeOf(root.left )+ 1 + sizeOf(root.right));
	 }
	 
	 public boolean search(int key) {
		 return searchfor(root, key);
	 }

	 public boolean searchfor(Node root, int key) {
		 if(root == null)
			 return false;
		 if((int) root.key == key)
			 return true;
		 
		 if(key > (int)root.key)
			 return searchfor(root.right, key);
		 
		 else if(key <(int)root.key)
		 return searchfor(root.left, key);
		 
		 return false;
	 }
	
}