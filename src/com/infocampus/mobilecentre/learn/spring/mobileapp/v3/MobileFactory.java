package com.infocampus.mobilecentre.learn.spring.mobileapp.v3;

public class MobileFactory {

	public static Mobile getMobile(String mobile_model) {
		Mobile mobile=null;
		
		if(mobile_model.equalsIgnoreCase("lgq6")) {
			mobile=new LGQ6();
		}else if (mobile_model.equalsIgnoreCase("motog5s")) {
			mobile=new MotoG5S();
		}else if (mobile_model.equalsIgnoreCase("nokia6")) {
			mobile=new Nokia6();
		}else if (mobile_model.equalsIgnoreCase("redmi4")) {
			mobile=new Redmi4();
		}else if (mobile_model.equalsIgnoreCase("sonyxperiaxz")) {
			mobile=new SonyXperiaXZ();
		}
		
		return mobile;
		
	}
}
