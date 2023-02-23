package com.credersi.animals;

public class Lynx extends Animal implements Purr, Hunt {
	public Lynx() {	}
	
	public int purr() {
		return 30;
	}
	
	public String hunt() {
		this.feeds();
		return "Hunted and fed";
	}
}