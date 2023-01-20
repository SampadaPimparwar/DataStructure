package dataStructures;

import java.util.Scanner;
import dataStructures.Arrays;
import dataStructures.LinkedList;
import dataStructures.QueueLinkedList;
import dataStructures.QueueLinkedList.Queue.Queue1;
import dataStructures.Queue.Queue2;
import dataStructures.Stack.Stack2;
import dataStructures.StackOfArraylisList.Stack;

public class Main {
	public static int size;
	private static int d;

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		int myCase = 0;
		String choice = null;

		Arrays aa = new Arrays();
		LinkedList ll = new LinkedList();
		Queue1 q = new Queue1();
		Queue2 qq = new Queue2(size);
		Stack2 s = new Stack2();
		Stack s2 = new Stack();

		do {
			System.out.println("1.Arrays");
			System.out.println("2.linkedlist");
			System.out.println("3.QueueLinkedList");
			System.out.println("4.Queue");
			System.out.println("5.Stack");
			System.out.println("6.StackOfArrayList");

			myCase = sc.nextInt();

			switch (myCase) {
			
			case 1:

				System.out.println("Enter number of elements");
				int g = sc.nextInt();
				int a[] = new int[g];
				do {
					System.out.println("1.insert");
					System.out.println("2.insertAtStart");
					System.out.println("3.print list");

					System.out.println("Enter number of elements");
										
					

					switch (myCase) {
					case 1:
						System.out.println("The number is addede. ");
						aa.insert(a,d);
						break;
					case 2:
						System.out.println("The number is added at Start");
						aa.insertAtStart(a, d);
						break;
					case 3:
						
						aa.print(a);

					default:
						System.out.println("invoild number");
					}
					System.out.println("do you want to repeat steps?(yes/no)");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));

				break;

			case 2:

				do {
					System.out.println("1.addfirst");
					System.out.println("2.addlast");
					System.out.println("3.deletefirst");
					System.out.println("4.deletelast");
					System.out.println("___enter number for performing operations___");

					myCase = sc.nextInt();

					System.out.println("_____add 2 nodes  the list is empty________");

					switch (myCase) {
					case 1:
						System.out.println("_____add something list is empty________");
						ll.addFirst(" ");
						break;

					case 2:
						ll.addLast(" ");
						break;

					case 3:
						ll.deleteFirst();
						System.out.println("_____________deleted_____________");
						break;
					case 4:
						ll.deleteLast();

					default:
						System.out.println("the case is invalid");
					}
					System.out.println("do wann try again?(yes/no)?");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));

				break;

			case 3:
				do {
					System.out.println("1.isEmpty");
					System.out.println("2.Add");
					System.out.println("3.remove");
					System.out.println("4.peek");

					myCase = sc.nextInt();
					switch (myCase) {

					case 1:
						q.isEmpty();
						break;
					case 2:
						System.out.println("Add elements");
						d = sc.nextInt();
						q.add(d);
						break;
					case 3:
						System.out.println("Removed ");
						q.remove();
						break;
					case 4:
						System.out.println(" Top element ");
						q.peek();
						break;

					default:
						System.out.println("invalid number");
					}
					System.out.println("do you want to repeat steps?(yes/no)");
					choice = sc.next();
				} while (choice.equalsIgnoreCase("yes"));


				break;
			case 4:
				do {
					System.out.println("1.isEmpty");
					System.out.println("2.add");
					System.out.println("3.remove");
					System.out.println("4.peek");
					myCase = sc.nextInt();
					
				switch(myCase) {
				case 1:
					System.out.println("the list is empty");
					qq.isEmpty();
					break;
				case 2:
					System.out.println("added successfully");
					qq.add(d);
					break;
				case 3:
					System.out.println("the element is deleted");
					qq.remove();
					break;
				case 4:
					System.out.println("the top element is seen");
					qq.peek();
					
				default:System.out.println("Invalid number");
					
				}System.out.println("do you want to repeat steps?(yes/no)");
				choice = sc.next();
			} while (choice.equalsIgnoreCase("yes"));

				break;
			case 5:

				do {
					System.out.println("1.isEmpy");
					System.out.println("2.push");
					System.out.println("3.pop");
					System.out.println("4.peek");
					
					myCase = sc.nextInt();
					
				switch(myCase) {
				case 1:
					System.out.println("the list is empty");
					s.isEmpty();
					break;
				case 2:
					System.out.println("added elements");
					s.push(d);
					break;
				case 3:
					System.out.println("poped elements");
					s.pop();
					break;
				case 4:
					System.out.println("peeked toped element");
					s.peek();
					break;
					
				default:System.out.println("Invalid case");
				}
				System.out.println("do you want to repeat steps?(yes/no)");
				choice = sc.next();
			} while (choice.equalsIgnoreCase("yes"));
			System.out.println("Stack understand");
			
			break;
			case 6:

				do {
					System.out.println("1.isEmpty");
					System.out.println("2.push");
					System.out.println("3.pop");
					System.out.println("4.peek");
					System.out.println("5. Exit");
					myCase = sc.nextInt();
				
				switch(myCase) {
				case 1:
					System.out.println("the list is empty");
					s2.isEmpty();
					break;
					
				case 2:
					System.out.println("pushed elements");
					s2.push(d);
					break;
				case 3:
					System.out.println("poped element");
					s2.pop();
					break;
				case 4:
					System.out.println("peeked element");
					s2.peek();
					break;
				case 5:
					System.out.println("Thanks....");
				
				default:System.out.println("Invalid number");
				}System.out.println("do you want to repeat steps?(yes/no)");
				choice = sc.next();

				}while(choice.equalsIgnoreCase("yes"));
			
			
			default:System.out.println("invalid choise");

			}

			System.out.println("do you want to repeat steps?(yes/no)");
			choice = sc.next();
		} while (choice.equalsIgnoreCase("yes"));
		System.out.println("mission successfull");
	}

}
