package com.infocampus.mobilecentre.learn.spring.mobileapp.v2;

public class MobileApp {

	public static void main(String[] args) {

		Mobile mobile = null;
		// for Sony Xperia XZ mobile
		// mobile=new SonyXperiaXZ();

		// mobile=new LGQ6();

		//mobile=new MotoG5S();
		
		mobile=new Redmi4();

		// common function
		mobile.switchOnTheMobile();
	}

}
