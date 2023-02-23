package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SparrowTest {
	@Test
	public void testInitialState() {
		Sparrow sparrow = new Sparrow();
		assertTrue(sparrow.isAlive());
		assertEquals(sparrow.howHungry(), 50);
	}
	
	@Test
	public void testFly() {
		Sparrow sparrow = new Sparrow();
		assertEquals(sparrow.fly(), 5);
	}
}
