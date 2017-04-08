
public class LinkedQueue implements Queue {
	
	Node first;
	Node last;
	
	int size = 0;
	
	@Override
	public String peek() {		
		return first.data;
	}

	@Override
	public String poll() {
		if(isEmpty()) return null;
		String s = first.data;
		first = first.next;
		size--;
		return s;
	}

	@Override
	public void offer(String str) {
		if(isEmpty()){
			first = new Node();
			first.data = str;
			last = first;
		}else{
			Node newLast = new Node();
			newLast.data = str;
			last.next = newLast;
			last = newLast;					
		}
	}
	
	private boolean isEmpty(){
		return size == 0;
	}
	
	private class Node{
		String data;
		Node next;
	}

}
