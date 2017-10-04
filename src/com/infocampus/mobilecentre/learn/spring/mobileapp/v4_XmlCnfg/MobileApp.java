package com.infocampus.mobilecentre.learn.spring.mobileapp.v4_XmlCnfg;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobileApp {

	public static void main(String[] args) {
		//create spring container 
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("com/infocampus/mobilecentre/learn/spring/mobileapp/v4_XmlCnfg/spring-config.xml");
		

		// mobile models
		/* LGQ6, Redmi4, SonyXperiaXZ, motog5s, Nokia6 */

		Mobile mobile = (Mobile) context.getBean("motog5s");

		mobile.switchOnTheMobile();
	}

}
