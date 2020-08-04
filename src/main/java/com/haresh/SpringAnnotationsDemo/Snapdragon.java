package com.haresh.SpringAnnotationsDemo;


public class Snapdragon implements Processor {
	String version;

	
	public Snapdragon(String version) {
		this.version = version;
	}


	@Override
	public String toString() {
		return "Snapdragon [version=" + version + "]";
	}
	
}
