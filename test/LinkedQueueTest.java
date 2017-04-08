import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class LinkedQueueTest {
	
	Queue queue;
	
	@Before
	public void setUp(){
		queue = new LinkedQueue();
	}
	@Test
	public void testEnqueue() {
		queue.offer("Ramdas");
		queue.offer("Sawant");
		queue.offer("Kartik");
		queue.offer("Amita");
			
		assertEquals("Ramdas", queue.poll());
		assertEquals("Sawant", queue.poll());
		assertEquals("Kartik", queue.poll());
		
		
	}

}
