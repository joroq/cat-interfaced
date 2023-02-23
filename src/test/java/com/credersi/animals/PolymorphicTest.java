package com.credersi.animals;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PolymorphicTest {
	public String hunting(Hunt hunter) {
		return hunter.hunt();
	}
	
	@Test
	public void testPolymorphism() {
		Hunt cat = new Cat();
		Hunt eagle = new Eagle();
		
		assertEquals(hunting(cat), "Hunted a gift for my human");
		assertEquals(hunting(eagle), "Hunted and fed");
	}
}
