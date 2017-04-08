
public class ArrayStack implements Stack {
	
	String[] arr ;
	
	int capacity;
	
	int size = 0;
	
	int topOfStack = -1;
	
	public ArrayStack(int capacity){
		this.capacity = capacity;
		arr = new String[capacity];
	}
	
	@Override
	public void push(String str) {
		if(isFull()) throw new RuntimeException("Stack full");
		arr[++topOfStack] = str;
		size++;

	}

	@Override
	public String pop() {
		if(isEmpty()) throw new RuntimeException("Stack Empty");
		size--;		
		return arr[topOfStack--];
	}

	@Override
	public String peek() {		
		return arr[topOfStack];
		
	}
	
	private boolean isEmpty(){
		return size == 0;
	}
	
	private boolean isFull(){
		return size == capacity;
	}

}
