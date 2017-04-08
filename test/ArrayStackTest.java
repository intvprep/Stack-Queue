import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ArrayStackTest {

	Stack stack;
	@Before
	public void setUp(){
		
		stack = new ArrayStack(10);
	}
	
	@Test
	public void testPop() {
		
		stack.push("Sawant");
		stack.push("Ramdas");
		
		assertEquals("Ramdas", stack.pop());
		assertEquals("Sawant", stack.pop());
		
		stack.push("Kartik");
		assertEquals("Kartik", stack.peek());
		stack.push("Amita");
		assertEquals("Amita",stack.pop());
		assertEquals("Kartik", stack.peek());
		assertEquals("Kartik", stack.pop());
		
		
		
	}
	
	@Test(expected=RuntimeException.class)
	public void emptyPop(){
		stack.pop();
	}
	
	@Test(expected=RuntimeException.class)
	public void fullPush(){
		stack.push("1");
		stack.push("2");
		stack.push("3");
		stack.push("4");
		stack.push("5");
		stack.push("6");
		stack.push("7");
		stack.push("8");
		stack.push("9");
		stack.push("10");
		stack.push("11");				
	}
}
