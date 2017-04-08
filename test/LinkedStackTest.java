import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedStackTest {

	Stack stack;
	
	@Before
	public void setUp(){
		stack = new LinkedStack();
	}
	
	@Test
	public void testPop() {
		stack.push("Ramdas");
		stack.push("Sawant");
		
		assertEquals("Sawant", stack.peek());
		assertEquals("Sawant", stack.pop());
		assertEquals("Ramdas", stack.pop());
		
		
	}

}
