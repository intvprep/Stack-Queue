
public interface Dequeue extends Queue {
	String peekLast();
	String pollLast();
	void offerFirst(String str);
}
