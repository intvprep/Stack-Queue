
public class LinkedDequeue implements Dequeue {
	
	Node first;
	Node last;
	
	int size = 0;
	
	@Override
	public String peek() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String poll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void offer(String str) {
		// TODO Auto-generated method stub

	}

	@Override
	public String peekLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String pollLast() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void offerFirst(String str) {
		// TODO Auto-generated method stub

	}
	
	private static class Node{
		String data;
		Node next;
	}

}
