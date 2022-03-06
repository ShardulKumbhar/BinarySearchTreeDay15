package binarynode;

public class BST1 extends INode1 {
	/**
	 * 
	 * 1. Creating node to insert new subnodes to binary tree
	 * 2.  Method to search for a given key value
	 * 3. Method for printing the Binary Tree
	 * 
	 * @param k-data to be inserted
	 * @return
	 */

	
	public INode1 createNewNode(int k) {
		INode1 a = new INode1();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	/*
	 * 1. Creating node to insert new subnodes to binary tree
	 */
	public INode1 insert(INode1 node, int k) {
		if (node == null) {
			return createNewNode(k);
		}
		if (k < node.data) {
			node.left = insert(node.left, k);
		} else if (k > node.data) {
			node.right = insert(node.right, k);
		}
		return node;

	}
	/*
	 *2.  Method to search for a given key value
	 */
	public INode1 search(INode1 node, int key) {
		
		// Base Cases: root is null or key is present at root
		if (node == null || node.data == key) {
			System.out.println(node.data + " is present in the Tree");
			return node;
		} else {
			// Key is greater than root's key
			if (node.data < key) {
				return search(node.right, key);
			} else {
				// Key is smaller than root's key
				return search(node.left, key);
			}
		}
	}

	/*
	 * 3. Method for printing the Binary Tree
	 */
	public void printBST(INode1 node) {
		if (node == null) {
			return;
		}
		printBST(node.left);
		System.out.print(node.data + " -> ");
		printBST(node.right);
	}

}