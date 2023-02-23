package com.credersi.animals;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class LynxTest {
	@Test
	public void testInitialState() {
		Lynx lynx = new Lynx();
		assertTrue(lynx.isAlive());
		assertEquals(lynx.howHungry(), 50);
	}
	
	@Test
	public void testPurrs() {
		Lynx lynx = new Lynx();
		assertEquals(lynx.purr(), 30);
	}
	
	@Test
	public void testHunt() {
		Lynx lynx = new Lynx();
		assertEquals(lynx.hunt(), "Hunted and fed");
	}
}
