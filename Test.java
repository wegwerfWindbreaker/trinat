package animation;

import static org.junit.Assert.*;

public class Test {

	@org.junit.Test
	public void test() {
		countdown c = new countdown();
		
		c.counter(10);
		
		assertEquals(10, c.getTimer());
		
		fail("Not yet implemented");
	}

}
