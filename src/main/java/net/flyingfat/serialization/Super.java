package net.flyingfat.serialization;

import java.io.Serializable;

public class Super implements Serializable {

	private String s;
	
	public Super(String s) {
		super();
		this.s = s;
	}
	
	public Super() {}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}
	
}
