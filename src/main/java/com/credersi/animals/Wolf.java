package com.credersi.animals;

public class Wolf extends Animal implements Hunt {
	public Wolf() {	}
	
	public String hunt() {
		this.feeds();
		return "Hunted and fed";
	}
}