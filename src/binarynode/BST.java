package binarynode;

public class BST extends INode {

	public INode createNewNode(int k) {
		INode a = new INode();
		a.data = k;
		a.left = null;
		a.right = null;
		return a;
	}

	/*
	 * 1. Creating new node if there is no Binary Tree exists then
	 */
	public INode insert(INode node, int value) {
		if (node == null) {
			return createNewNode(value);
		}
		if (value < node.data) {
			node.left = insert(node.left, value);
		} else if (value > node.data) {
			node.right = insert(node.right, value);
		}
		return node;

	}

	/*
	 * 2. Method for printing the Binary Tree
	 */
	public void printBST(INode node) {
		if (node == null) {
			return;
		}
		printBST(node.left);
		System.out.print(node.data + " -> ");
		printBST(node.right);
	}

}