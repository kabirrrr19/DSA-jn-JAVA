package DLLString;

public class Main {
	public static void main(String[] args) {
		DoublyLinkedListString list = new DoublyLinkedListString();
		System.out.println("remove From end with empty list   : " + list.removeFromEnd());
		System.out.println("remove From front with empty list : " + list.removeFromEnd());
		list.addToEnd("Atul");
		System.out.println("remove From end with one element in the list   : " + list.removeFromEnd());
		list.addToEnd("Kabir");
		System.out.println("remove From front with one element in the list : " + list.removeFromEnd());
		list.printList();
		list.addToFront("Ankit");
		list.addToFront("Anjali");
		list.addToFront("Dad");
		list.addToEnd("Mom");
		list.printList();
		System.out.println("--------------------before add before &&  add after---------------");
		list.addAfter("Ankit", "Atul");
		list.addBefore("Ankit", "Atul");
		System.out.println("--------------------after add before &&  add after---------------");
		list.printList();
		
		System.out.println(list.getSize());
		list.printList();
		list.printReverseList();
		
		
	}
}
