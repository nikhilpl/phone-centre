package com.infocampus.mobilecentre.learn.spring.mobileapp.v3;

public class Redmi4 implements Mobile {

	public Redmi4() {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		
	}

}
