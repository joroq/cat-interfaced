package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EagleTest {
	@Test
	public void testInitialState() {
		Eagle eagle = new Eagle();
		assertTrue(eagle.isAlive());
		assertEquals(eagle.howHungry(), 50);
	}
	
	@Test
	public void testHunt() {
		Eagle eagle = new Eagle();
		assertEquals(eagle.hunt(), "Hunted and fed");
	}
	
	@Test
	public void testFly() {
		Eagle eagle = new Eagle();
		assertEquals(eagle.fly(), 15);
	}
}
