package dataStructures;

import java.util.Scanner;

public class Stack {

	static class Node {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	static class Stack2 {
		public static Node head;

		public static boolean isEmpty() {
			return head == null;

		}

		public static void push(int data) {
			Node newNode = new Node(data);
			if (isEmpty()) {
				head = newNode;
				return;
			}
			newNode.next = head;
			head = newNode;
		}

		public static int pop() {
			if (isEmpty()) {
				return -1;
			}
			int top = head.data;
			head = head.next;
			return top;

		}

		public static int peek() {
			if (isEmpty()) {
				return -1;

			}
			return head.data;
		}
	}

}
