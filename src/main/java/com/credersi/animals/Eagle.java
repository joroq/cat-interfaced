package com.credersi.animals;

public class Eagle extends Animal implements Hunt, Flies {
	public Eagle() { }
	
	public String hunt() {
		this.feeds();
		return "Hunted and fed";
	}
	
	public int fly() {
		return 15;
	}
}
