package DLLString;

	/*
	 * addToFront() 
	 * 1. head points to new element 
	 * 2. next of new node points to the head(i.e. previous first element)
	 * 3. Set the previous of head as the node.
	 * 4. if it's the first element then the tail has to be updated to point to the node.
	 *
	 * removeFromFront() 
	 * 1. head should point at the next of the first node 
	 * 2. if the list contains only one element update the tail to null
	 * 
	 * addToTail()
	 * 1. node to be added should have the previous pointing to tail
	 * 2. next of the tail should point at new node
	 * 3. if it's the first element head should point to the node
	 * 
	 * removeFromTail()
	 * 1. the next of the previous element should point to null as it's the last element
	 * 2. the tail should point to the previous of the tail
	 * 3. If there is only one element in the list, then head should be null
	 * (HERE IF 1 & 2 ARE PERFORMED IN REVERSE ORDER YOU WILL GET A NULLPOINTEREXCEPTION)
	 * 
	 * 
	 * addBefore()
	 * 1. if the list is empty return
	 * 2. Iterate through the list to find the value before which we want to insert
	 * 3. check if current is equal to null then return
	 * 4. create the new node and set it's previous to current's previous
	 * 5. set the next of the new node to current
	 * 6. set the previous of the current to the new node
	 * 7. if the current is head then set the head == node 
	 * 		else
	 * 	  set the next of the element behind node to point to node. 
	 * 
	 * addAfter()
	 * 1. if the list is empty return
	 * 2. Iterate through the list to find the value before which we want to insert
	 * 
	 */

public class DoublyLinkedListString {
	public NodeString head;
	public NodeString tail;
	public int size;
	
	
	public void addToFront(String name) {
		NodeString node = new NodeString(name);
		if(head == null) {
			tail = node; 
		// node.setNext is not used here because if node it's first element the next of node will be null
		}
		else {
			node.setNext(head);	
			head.setPrev(node);
			// setting the previous of the first element as new node to maintain reverse traversing
		}
		head = node;
		size++;
	}
	
	
	public String removeFromFront() {
		if(isEmpty()) {
			return null;
		}
		if(head.getNext() == null ) {
			tail = null;
			// if it's first ele, then tail has to be null
		}

		NodeString removedNode = head;
		// setting the head to point to the next element
		head = removedNode.getNext();
		
		// cleaning the references
		removedNode.setNext(null);
		removedNode.setPrev(null);
		size--;
		return removedNode.getName();
	}

	
	public void addToEnd(String name) {
		NodeString node = new NodeString(name);
		if(isEmpty() == true) {
			head = node;
		}
		else {
			node.setPrev(tail);
			tail.setNext(node); 
			// current tail elements next should point at  
		}
		tail = node;
		size++;
		
	}
	
	
	public String removeFromEnd() {
		if(isEmpty() == true) {
			return null;
		}
		if(tail.getPrev() == null) {
			head = null;
		}
		else { 
			tail.setNext(null);
		}
		NodeString removedNode = tail;
		tail = removedNode.getPrev();
		
		// cleaning references
		removedNode.setNext(null);
		removedNode.setPrev(null);
		size--;
		return removedNode.getName();
	}
	
	public boolean addBefore(String nameValue, String valueToInsert) {
		NodeString node = new NodeString(valueToInsert);
		if(head == null ) {
			return false;
		}
		NodeString current = head;
		while(current !=null && current.getName() != nameValue) {
			current = current.getNext();
		}
		if(current == null ) {
			return false;
		}
		node.setPrev(current.getPrev());
		node.setNext(current);
		current.setPrev(node);
		
		// Here we have to handle a special case that what if we the element before which we want to
		// insert is at the head of the linked list
		if(head == current) {
			head = node;
		}
		else {
			NodeString previous = node.getPrev();
			previous.setNext(node);
		}
		size++; 
		return true;
	
	}
	
	
	public boolean addAfter(String nameValue, String valueToInsert) {
		NodeString node = new NodeString(valueToInsert);
		if(head == null ) {
			return false;
		}
		NodeString current = head;
		while(current !=null && current.getName() != nameValue) {
			current = current.getNext();
		}
		if(current == null ) {
			return false;
		}
		node.setPrev(current);
		node.setNext(current.getNext());
		current.setNext(node);
		
		// Here we have to handle a special case that what if we the element after which we want to
		// insert is at the end of the linked list
		if(tail == current) {
			tail = node;
		}
		else {
			// node ke next me jo element hai uske previous me node set karna hai
			NodeString next = node.getNext();
			next.setPrev(node);
		}
		size++; 
		return true;
	
	}
	
	
	
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public int getSize() {
		return size;
	}
	
	
	public void printList() {
		NodeString current = head;
		System.out.print("Head <-> ");
		while(current != null ) {
			System.out.print(current.getName());
			System.out.print(" <-> ");
			current = current.getNext();
		}
		System.out.println(" null ");
	}
	
	
	public void printReverseList() {
		NodeString current = tail;
		System.out.print("Tail <-> ");
		while(current != null) {
			System.out.print(current.getName());
			System.out.print(" <-> ");
			current = current.getPrev();
		}
		System.out.println("Head");
	}
	
	
}
