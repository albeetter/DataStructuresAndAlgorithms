package binaryTrees;
import java.util.LinkedList;
import java.util.Queue;

public class DeleteNode {
	static class Node {
		int key;
		Node left, right;
		// Constructor
		Node(int key) {
			this.key = key;
			left = null;
			right = null;
		}
}

	static Node root;
	static void inorder(Node temp) {
		if (temp == null)
			return;
		inorder(temp.left);
		System.out.print(temp.key + " ");
		inorder(temp.right);
	}
	static void deleteDeepest(Node root, Node delNode) {
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null;
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();

			if (temp == delNode) {
				temp = null;
				return;
			}
			if (temp.right != null) {
				if (temp.right == delNode) {
					temp.right = null;
					return;
				} else
					q.add(temp.right);
			}
			if (temp.left != null) {
				if (temp.left == delNode) {
					temp.left = null;
					return;
				} else
					q.add(temp.left);
			}
		}
	}
	static void delete(Node root, int key) {
		if (root == null)
			return;
		if (root.left == null && root.right == null) {
			if (root.key == key) {
				root = null;
				return;
			} else
				return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(root);
		Node temp = null, keyNode = null;
		while (!q.isEmpty()) {
			temp = q.peek();
			q.remove();
		if (temp.key == key)
				keyNode = temp;
		if (temp.left != null)
			q.add(temp.left);
		if (temp.right != null)
			q.add(temp.right);
		}
		if (keyNode != null) {
			int x = temp.key;
			deleteDeepest(root, temp);
			keyNode.key = x;

		}
	}
	public static void main(String args[]) {
		root = new Node(10);
		root.left = new Node(11);
		root.left.left = new Node(7);
		root.left.right = new Node(12);
		root.right = new Node(9);
		root.right.left = new Node(15);
		root.right.right = new Node(8);
		System.out.print("Inorder traversal before deletion: ");
		inorder(root);
		int key = 7;
		delete(root, key);
		System.out.print("\nInorder traversal after deletion: ");
		inorder(root);
	}
}