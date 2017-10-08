package com.infocampus.mobilecentre.learn.spring.mobileapp.v5_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component(value="motog5s")
public class MotoG5S implements Mobile {
	private MusicPlayer player;

	@Autowired
	public MotoG5S(@Qualifier("googlePlayMusic")MusicPlayer player) {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
		this.player=player;
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		
	}

}
