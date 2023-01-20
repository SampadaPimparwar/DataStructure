package dataStructures;

import java.util.Scanner;

class LinkedList {
	Node head;
	private int size;
	Scanner sc = new Scanner(System.in);

	LinkedList() {
		this.size = 0;
	}

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = sc.next();
			this.next = null;
			size++;
		}
	}

	// Addfirst
	public void addFirst(String data) {
		System.out.println("addfirst data");
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	// AddLast
	public void addLast(String data) {
		System.out.println("addlast data");
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node currNode = head;
		while (currNode.next != null) {
			currNode = currNode.next;
		}
		currNode.next = newNode;
	}

	// Delete
	public void deleteFirst() {
		System.out.println("deleting first data");
		if (head == null) {
			System.out.println("empty list");
			return;
		}
		size--;
		head = head.next;
	}

	// DeleteLast
	public void deleteLast() {
		System.out.println("deleting last data.");
		if (head == null) {
			System.out.println("list is empty");
			return;
		}
		size--;
		if (head == null) {
			head = null;
			return;
		}
		Node secondLast = head;
		Node lastNode = head.next;
		while (lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		secondLast.next = null;
	}

	// Print
	public void printList() {
		Node currNode = head;
		while (currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		System.out.println("null");
	}

	public int getSize() {
		System.out.println("Showing size");
		return size;
	}

}
