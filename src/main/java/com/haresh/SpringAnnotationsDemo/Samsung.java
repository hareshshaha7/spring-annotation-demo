package com.haresh.SpringAnnotationsDemo;

import org.springframework.beans.factory.annotation.Autowired;

public class Samsung implements Mobile {

	@Autowired
	private Processor processor; 
	
	public Processor getProcessor() {
		return processor;
	}

	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	@Override
	public void MobileConfig() {
		// TODO Auto-generated method stub
		System.out.println("This is a Samsung mobile");
		System.out.println("Processor: "+ this.getProcessor());		
	}

}
