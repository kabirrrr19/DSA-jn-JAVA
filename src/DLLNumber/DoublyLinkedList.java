package DLLNumber;

import DLLString.NodeString;

public class DoublyLinkedList {
	private NodeNumber head;
	private NodeNumber tail;
	private int size;
	
	public void addToFront(int num) {
		NodeNumber node = new NodeNumber(num);
		node.setNext(head);
		if(isEmpty() == true) {
//			node.setPrev(null); by default value is null
			tail = node;
 		}
		else {
			head.setPrev(node);
			// here also prev of node is by default null
		}
		head = node;
		size++;
	}
	
	
	public int removeFromFront() {
		if(isEmpty()) {
			return 0;
		}
		NodeNumber removedNode = head;
		if(head.getNext() == null) {
			tail = null;
		}
		else {			
			head = removedNode.getNext();
		}
		removedNode.setPrev(null);
		removedNode.setNext(null);
		size--;
		return removedNode.getNum();
	}
	
	public void addToTail(int num) {
		NodeNumber node = new NodeNumber(num);
		if(tail == null) {
			node.setNext(head);
//			node.setPrev(null); by default value is null
			head = node;
		}else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail = node;
		size++;
	}
	
	public int removeFromTail() {
		if(isEmpty()) {
			return 0;
		}
		NodeNumber removedNode = tail;
		if(tail.getPrev() == null) {
			head = null;
		}
		else {
			tail = tail.getPrev(); // setting the tail to point to the previous element
			tail.setNext(null); // setting the second last element's next variable to null
		}
		size--;
		return removedNode.getNum();
}
		

	int getHeadEle() {
		return head.getNum();
	}
	
	public int getTailEle() {
		return tail.getNum();
	}
	
	public int searchAt(int num) {
		NodeNumber current = head;
		if (num >= size || num < 0) {
			return 0;
		}
		int i = 0;
		while(i < num) {
			current = current.getNext();
			i++;
		}
		return current.getNum();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		NodeNumber current = head;
		System.out.print("Head -> ");
		while(current != null) {
			System.out.print(current.getNum());
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("Tail");
	}
	
	public void printReverseList() {
		NodeNumber current = tail;
		System.out.print("Tail <-> ");
		while(current != null) {
			System.out.print(current.getNum());
			System.out.print(" <-> ");
			current = current.getPrev();
		}
		System.out.println("Head");
	}
}
