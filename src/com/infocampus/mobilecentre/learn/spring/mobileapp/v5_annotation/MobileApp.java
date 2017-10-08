package com.infocampus.mobilecentre.learn.spring.mobileapp.v5_annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {

	public static void main(String[] args) {
		//create spring container 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/infocampus/mobilecentre/learn/spring/mobileapp/v5_annotation/spring-config.xml");
		

		// mobile models
		/* lgq6, redmi4, sonyxperia, motog5s, nokia6 */

		Mobile mobile = (Mobile) context.getBean("motog5s");

		mobile.switchOnTheMobile();
	}

}
