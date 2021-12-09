package DLLString;

public class NodeString {
	public NodeString prev;
	public NodeString next;
	public String name;
	
	public NodeString(String name) {
		this.name = name;
	}

	public NodeString getPrev() {
		return prev;
	}

	public void setPrev(NodeString prev) {
		this.prev = prev;
	}

	public NodeString getNext() {
		return next;
	}

	public void setNext(NodeString next) {
		this.next = next;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
