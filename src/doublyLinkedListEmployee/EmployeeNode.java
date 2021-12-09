package doublyLinkedListEmployee;

public class EmployeeNode {
	private EmployeeNode next;
	private EmployeeNode prev;
	private Employee employee;
	

	public EmployeeNode(Employee employee) {
		this.employee = employee;
	}

	public EmployeeNode getNext() {
		return next;
	}

	public void setNext(EmployeeNode next) {
		this.next = next;
	}

	public EmployeeNode getPrev() {
		return prev;
	}

	public void setPrev(EmployeeNode prev) {
		this.prev = prev;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public String toString() {
		return employee.toString();
	}
	
}
