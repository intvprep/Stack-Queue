
public class LinkedStack implements Stack {
	
	private Node top;
	
	@Override
	public void push(String str) {
		if(top == null){
			top = new Node();
			top.data = str;
		}else{
			Node lastTop = top;
			top = new Node();
			top.data = str;
			top.next = lastTop;
		}

	}

	@Override
	public String pop() {
		if(top == null) return null;
		String str = top.data;
		top = top.next;
		return str;
	}

	@Override
	public String peek() {		
		return top.data;
	}
	
	private class Node{
		String data;
		Node next;
	}
}
