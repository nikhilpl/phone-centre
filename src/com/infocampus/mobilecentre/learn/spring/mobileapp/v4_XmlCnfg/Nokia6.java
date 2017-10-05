package com.infocampus.mobilecentre.learn.spring.mobileapp.v4_XmlCnfg;

public class Nokia6 implements Mobile {

	private MusicPlayer musicPlayer;
	public Nokia6(MusicPlayer musicPlayer) {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
		this.musicPlayer=musicPlayer;
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		musicPlayer.playMusic();
	}

}
