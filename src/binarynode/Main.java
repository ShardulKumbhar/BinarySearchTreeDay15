package binarynode;
public class Main {

	/**
	 * 
	 * @param args 
	 *  Procedure:- 
	 * ===============================================================
	 *   Create a Binary Search Tree by adding 56 and then adding 30 & 70.
	 *1. Creating object to access the function of function class 
	 *2. Adding the sub-nodes of Binary Tree 
	 *3. Printing the elements
	 *=================================================================
	 */
	
	public static void main(String[] args) {

		/*
		 * 1. Creating an object of function class
		 */
		BST link = new BST();
		INode root = null;

		/*
		 * 3.Adding sub-nodes to the Binary Tree
		 */
		root = link.insert(root, 56);
		root = link.insert(root, 30);
		root = link.insert(root, 70);

		/*
		 * 4.Printing the tree
		 */
		link.printBST(root);

	}

}
