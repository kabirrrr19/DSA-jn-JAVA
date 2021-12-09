	package sllNumbers;

public class LinkedListSLL {
	private NodeSLL head;
	private int size;
	
	public void addToFront(int num) {
		NodeSLL node = new NodeSLL(num);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public int searchAt(int num) {
		NodeSLL search = head;
		if (num >= size || num < 0) {
			return 0;
		}
		int i = 0;
		while(i < num) {
			search = search.getNext();
			i++;
		}
		return search.getNum();
	}
	
	public Object removeFromFront() {
		if (isEmpty() == true) {
			return null;
		}
		NodeSLL removedNode = head;
		head = removedNode.getNext();
		removedNode.setNext(null);
		return removedNode;
	}
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public int getSize() {
		return size;
	}
	
	public void printList() {
		NodeSLL current = head;
		System.out.print("Head -> ");
		while(current != null) {
			System.out.print(current.getNum());
			System.out.print(" -> ");
			current = current.getNext();
		}
		System.out.println("null");
	}
}
