package practiceSLL;



public class EmployeeLinkedListPractice {
	private EmployeeNodePractice head;
	private int size;
	
	public void addToFront(EmployeePractice employee) {
		EmployeeNodePractice node = new EmployeeNodePractice(employee);
		node.setNext(head);
		head = node;
		size++;
	}
	
	public EmployeeNodePractice deleteFromFront() {
		if(isEmpty() == true) {
			return null;
		}
		
		EmployeeNodePractice removedNode = head;
		head = head.getNext();
		size--;
		removedNode.setNext(null);
		return removedNode;
	}
	
	public int getSize() {
		return size;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	
	public void printList() {
		EmployeeNodePractice current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" -> ");
            current = current.getNext();
        }
        System.out.print("null");
	}
}
