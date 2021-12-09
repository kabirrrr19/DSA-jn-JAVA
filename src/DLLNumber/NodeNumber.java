package DLLNumber;
	
	

public class NodeNumber {
	private NodeNumber next;
	private NodeNumber prev;
	private int num;
	
	public NodeNumber(int num) {
		this.num = num;
	}

	public NodeNumber getNext() {
		return next;
	}

	public void setNext(NodeNumber next) {
		this.next = next;
	}

	public NodeNumber getPrev() {
		return prev;
	}

	public void setPrev(NodeNumber prev) {
		this.prev = prev;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
}
