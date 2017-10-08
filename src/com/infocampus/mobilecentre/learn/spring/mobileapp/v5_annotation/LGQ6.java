package com.infocampus.mobilecentre.learn.spring.mobileapp.v5_annotation;

/**
 * 
 * @author Nikhil
 * 
 * Dependency Injection using constructor
 *
 */
public class LGQ6 implements Mobile {
	private MusicPlayer mPlayer;
	private int player_version;
	private String player_color;

	/**
	 * @param mPlayer
	 * @param player_version
	 * @param player_color
	 */
	public LGQ6(MusicPlayer mPlayer, int player_version, String player_color) {
		super();
		this.mPlayer = mPlayer;
		this.player_version = player_version;
		this.player_color = player_color;
	}

	public LGQ6() {
		System.out.println(this.getClass().getSimpleName() + " mobile is being constructor.");
	}

	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName() + " mobile is Switch on... :-).");
		System.out.println(this.mPlayer.getClass().getSimpleName()+" Player color is" + this.player_color);
		System.out.println(this.mPlayer.getClass().getSimpleName()+" Player version is" + this.player_version);
	}

}
