package DLLNumber;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedList list = new DoublyLinkedList();
		list.addToFront(23);
		list.addToTail(120);
		list.addToFront(34);
		list.addToFront(38);
		System.out.println(list.getSize());
		System.out.println(list.isEmpty());
		list.printList();
		System.out.println(list.removeFromFront());
		list.printList();
		list.addToTail(8);
		list.addToTail(102);
		list.addToFront(1000);
		list.printList();
		System.out.println(list.removeFromTail());
		System.out.println(list.removeFromTail());
		System.out.println(list.removeFromTail());
		list.printList();
		list.printReverseList();
		System.out.println("Head Element : " + list.getHeadEle());
		System.out.println("Tail Element : " + list.getTailEle());
		System.out.println("Element at index : "+ list.searchAt(2));
	}
}
