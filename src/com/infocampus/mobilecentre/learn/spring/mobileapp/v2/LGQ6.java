package com.infocampus.mobilecentre.learn.spring.mobileapp.v2;

public class LGQ6 implements Mobile {

	public LGQ6() {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		
	}

}
