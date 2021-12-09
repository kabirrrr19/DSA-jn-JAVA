package practiceSLL;

public class EmployeeNodePractice {
	private EmployeePractice employee;
	private EmployeeNodePractice next;
	
	public EmployeeNodePractice(EmployeePractice employee) {
		this.employee = employee;
	}

	public EmployeePractice getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeePractice employee) {
		this.employee = employee;
	}

	public EmployeeNodePractice getNext() {
		return next;
	}

	public void setNext(EmployeeNodePractice next) {
		this.next = next;
	}
	
	public String toString() {
		return employee.toString();
	}

	
	
}
