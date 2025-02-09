package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class CatTest {
	@Test
	public void testInitialState() {
		Cat cat = new Cat();
		assertTrue(cat.isAlive());
		assertEquals(cat.howHungry(), 50);
	}
	
	@Test
	public void testPurrs() {
		Cat cat = new Cat();
		assertEquals(cat.purr(), 25);
	}
	
	@Test
	public void testHunt() {
		Cat cat = new Cat();
		assertEquals(cat.hunt(), "Hunted a gift for my human");
	}
}