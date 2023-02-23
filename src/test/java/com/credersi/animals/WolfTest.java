package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class WolfTest {
	@Test
	public void testInitialState() {
		Wolf wolf = new Wolf();
		assertTrue(wolf.isAlive());
		assertEquals(wolf.howHungry(), 50);
	}
	
	@Test
	public void testHunt() {
		Wolf wolf = new Wolf();
		assertEquals(wolf.hunt(), "Hunted and fed");
	}

}
