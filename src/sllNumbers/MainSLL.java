package sllNumbers;

public class MainSLL {
	public static void main(String[] args) {
		LinkedListSLL list = new LinkedListSLL();
		
		list.addToFront(23);
		list.addToFront(45);
		list.addToFront(37);
		System.out.println(list.getSize());
		System.out.println(list.isEmpty());
		list.printList();
		System.out.println(list.searchAt(4));
	}
}
