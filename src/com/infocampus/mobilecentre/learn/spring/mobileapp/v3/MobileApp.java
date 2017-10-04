package com.infocampus.mobilecentre.learn.spring.mobileapp.v3;

public class MobileApp {

	public static void main(String[] args) {

		// mobile models
		/* LGQ6, Redmi4, SonyXperiaXZ, MotoG5S, Nokia6 */

		Mobile mobile = MobileFactory.getMobile("Nokia6");

		mobile.switchOnTheMobile();
	}

}
