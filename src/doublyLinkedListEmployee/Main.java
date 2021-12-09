package doublyLinkedListEmployee;

public class Main {
	public static void main(String[] args) {
		Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee Kabir = new Employee("Kabir", "Singh", 1234);
        Employee Sakshi = new Employee("Sakshi", "Vaidya", 5368);
        Employee Atul = new Employee("Atul", "Mishra", 6528);

        EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println("empty list : " + list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        System.out.println("Removed Element : " + list.removeFromFront());
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println("empty List : " + list.isEmpty());
        list.addBefore(marySmith, Kabir);
        list.addAfter(marySmith, Sakshi);
        list.addToEnd(Atul);
        System.out.println("size of the list : " + list.getSize());

        list.printList();
        System.out.println();
        list.printListReverse();
        
        System.out.println("removed element at the end : " + list.removeFromEnd());
        
        list.printList();
        System.out.println();
        list.printListReverse();
//
//        list.removeFromFront();
//        System.out.println(list.getSize());
//        list.printList();
//        
//        System.out.println(list.removeFromFront());


    }
	
}
