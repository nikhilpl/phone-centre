package com.infocampus.mobilecentre.learn.spring.mobileapp.v3;

public class MotoG5S implements Mobile {

	public MotoG5S() {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		
	}

}
