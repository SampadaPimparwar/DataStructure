package dataStructures;

import java.util.Scanner;

public class QueueLinkedList {

	static class Queue{
		static class Node{
			Scanner sc = new Scanner(System.in);
			int data;
			Node next;
			
			Node(int data){
				this.data = sc.nextInt();
				next = null;
			}
		}
		static class Queue1{
			static Node head = null;
			static Node tail = null;
			
			public static boolean isEmpty() {
				return head == null & tail == null;
			}
			public static void add(int data) {
				Node newNode = new Node(data);
				if (tail == null) {
					tail = head = newNode;
					return;
				}
				tail.next = newNode;
				tail = newNode;
			}
				public static int remove() {
					if(isEmpty()) {
						System.out.println("empty queue");
						return -1;
					}
					int front = head.data;
					if(head == tail) {
					tail = null;
					}
					head = head.next;
					return front;
				}

				public static int peek() {
					if (isEmpty()) {
						System.out.println("empty queue");
						return -1;
					}
					return head.data;
				}
		}
		}
}
	

