package doublyLinkedListEmployee;

public class EmployeeLinkedList {
	private int size;
	private EmployeeNode head;
	private EmployeeNode tail;
	
	
	public void addToFront(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(isEmpty() == true) {
			tail = node;
		}
		else {
			node.setNext(head); 
			head.setPrev(node);
		}
		head = node;
		size++;
	}
	
	public Object removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = head;
		head = removedNode.getNext();
		size--;
		removedNode.setNext(null);
		removedNode.setPrev(null);
		return removedNode;
	}
	
	public boolean addBefore(Employee employee, Employee valueToInsert) {
		EmployeeNode node = new EmployeeNode(valueToInsert);
		EmployeeNode current = head;
		while(current.getEmployee() != employee && current != null ) {
			current = current.getNext();
		}
		if(current == null ){
			return false;
		}
		node.setNext(current);
		node.setPrev(current.getPrev());
		current.setPrev(node);
		if(head == current) {
			head = node;
		}
		else {
			node.getPrev().setNext(node);
		}
		size++;
		return true;
	}
	
	public void addToEnd(Employee employee) {
		EmployeeNode node = new EmployeeNode(employee);
		if(head == null ) {
			head = node;
		}
		else {
			tail.setNext(node);
			node.setPrev(tail);
		}
		tail = node;
		size++;
	}
	
	public Object removeFromEnd() {
		if(isEmpty()) {
			return null;
		}
		EmployeeNode removedNode = tail;
		if(tail.getPrev() == null ) {
			head = null;
		}
		tail = removedNode.getPrev();
		tail.setNext(null);
		size--;
		return removedNode;
	}
	
	public boolean addAfter(Employee employee, Employee valueToInsert) {
		EmployeeNode node = new EmployeeNode(valueToInsert);
		EmployeeNode current = head;
		while(current.getEmployee() != employee && current != null ) {
			current = current.getNext();
		}
		if(current == null ){
			return false;
		}
		node.setNext(current.getNext());
		node.setPrev(current);
		current.setNext(node);
		if(tail == current) {
			tail = node;
		}
		else {
			node.getNext().setPrev(node);
		}
		size++;
		return true;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void printList() {
		EmployeeNode current = head;
		System.out.println("--------------- Printing the list ----------------------");
		System.out.println("Head <---> ");
		while(current != null) {
			System.out.print(current);
			System.out.println(" <---> ");
			current = current.getNext();
		}
		System.out.println("Tail");
	}
	public void printListReverse() {
		EmployeeNode current = tail;
		System.out.println("--------------- Printing the Reverse list ----------------------");
		System.out.println("Tail <---> ");
		while(current != null) {
			System.out.print(current);
			System.out.println("	<--->	");
			current = current.getPrev();
		}
		System.out.println("Head");
	}
	
}
