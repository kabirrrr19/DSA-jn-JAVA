package practiceSLL;



public class MainPractice {
	public static void main(String[] args) {
		 EmployeePractice janeJones = new EmployeePractice("Jane", "Jones", 123);
	        EmployeePractice johnDoe = new EmployeePractice("John", "Doe", 4567);
	        EmployeePractice marySmith = new EmployeePractice("Mary", "Smith", 22);
	        EmployeePractice mikeWilson = new EmployeePractice("Mike", "Wilson", 3245);

	        EmployeeLinkedListPractice list = new EmployeeLinkedListPractice();
	        
	        list.addToFront(janeJones);
	        list.addToFront(johnDoe);
	        list.addToFront(marySmith);
	        list.addToFront(mikeWilson);

	        System.out.println(list.getSize());
	        list.printList();
	        System.out.println(list.deleteFromFront());
	        System.out.println(list.getSize());
	        list.printList();
	}
}
