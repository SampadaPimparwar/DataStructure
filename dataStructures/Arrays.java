package dataStructures;

import java.util.*;

public class Arrays {
	int count = 0;
	Scanner sc = new Scanner(System.in);
	int val = sc.nextInt();
 	public void insert(int a[],int val) {
		a[count++]=val;
		
	}
	public void insertAtStart(int a[],int val) {
		for(int i=count-1; i>0; i--) {
			a[i]=a[i-1];
		}
		a[0]=val;
	}
	public void print(int a[]) {
		for(int j=0; j<a.length; j++) {
			System.out.print(a[j]+" ");
		}
		System.out.println();
	}

}