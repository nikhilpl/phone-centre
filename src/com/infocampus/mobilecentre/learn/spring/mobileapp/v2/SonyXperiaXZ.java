package com.infocampus.mobilecentre.learn.spring.mobileapp.v2;

public class SonyXperiaXZ implements Mobile {

	public SonyXperiaXZ() {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		
	}

}
