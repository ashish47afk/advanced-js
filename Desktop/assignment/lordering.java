package assignmentupgrad;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class lordering {

	class Node {
		int data;
		Node left;
		Node right;

		public Node(int data) {
			this.data = data;
		}
	}
	public void print(Node root) {
		Queue<Node> q = new LinkedList<Node>();
		Stack<Node> s = new Stack<Node>();
		q.add(root);
		while (!q.isEmpty()) {
			Node n = q.remove();
			if (n.left != null) {
				q.add(n.left);
			}
			if (n.right != null) {
				q.add(n.right);
			}
			s.add(n);
		}
		while (s.isEmpty() == false) {
			System.out.print(s.pop().data + " ");
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);
		root.right.left = new Node(6);
		root.right.right = new Node(7);

		lordering i = new lordering();
		i.print(root);

	}
}