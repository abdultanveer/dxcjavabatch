package abstraction;


import org.junit.Test;

import junit.framework.TestCase;

public class BmwTest extends TestCase {
	
	@Test
	 public void testAdd() {
		System.out.println("i am in testadd  method");

		int expected = 30;
		int actual = BmwFlyingCar.add(10, 20);
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void testElgibility() {
		System.out.println("i am in testelgi  method");

		//boolean expected = false;
		boolean actual = BmwFlyingCar.isEligibletoVote(18);
		
		//assertFalse(actual);
		assertTrue(actual);
	}

	
	  @Override protected void setUp() throws Exception { super.setUp();
	  System.out.println("i am setting up the environment for test"); }
	  
	  @Override protected void tearDown() throws Exception { // TODO Auto-generated
	  super.tearDown();
	  System.out.println("i am releaseing   the resources held for test");
	  
	  }
	 
	
	

}
