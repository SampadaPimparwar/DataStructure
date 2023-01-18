package dataStructures;

 class LinkedList {
	Node head;
 	private int size;
	
   LinkedList(){
	   this.size = 0;
   }

	class Node {
		String data;
		Node next;

		Node(String data) {
			this.data = data;
			this.next = null;
			size++;
		}
	}

	// Addfirst
	public void addFirst(String data) {
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
		if (head == null) {
			System.out.println("empty list");
			return;
		}
		size--;
		head = head.next;
	}

	// DeleteLast
	public void deleteLast() {
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
		return size;
	}

	public static void main(String args[]) {
		LinkedList ll = new LinkedList();
		ll.addFirst("I");
		ll.addFirst("am");
		ll.printList();

		ll.addLast("Sampada");
		ll.printList();

		ll.addFirst("hii");
		ll.printList();

		ll.deleteFirst();
		ll.printList();

		ll.deleteLast();
		ll.printList();

		System.out.println(ll.getSize());

		ll.addFirst("this");
		System.out.println(ll.getSize());
	}

}
