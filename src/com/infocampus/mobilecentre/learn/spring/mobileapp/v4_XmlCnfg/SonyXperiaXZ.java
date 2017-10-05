package com.infocampus.mobilecentre.learn.spring.mobileapp.v4_XmlCnfg;

public class SonyXperiaXZ implements Mobile {
	
	private MusicPlayer mPlayer;
	private int mplayer_version;
	private String mplayer_color;

	
	/**
	 * @return the mplayer_version
	 */
	public int getMplayer_version() {
		return mplayer_version;
	}
	/**
	 * @param mplayer_version the mplayer_version to set
	 */
	public void setMplayer_version(int mplayer_version) {
		this.mplayer_version = mplayer_version;
	}
	/**
	 * @return the mplayer_color
	 */
	public String getMplayer_color() {
		return mplayer_color;
	}
	/**
	 * @param mplayer_color the mplayer_color to set
	 */
	public void setMplayer_color(String mplayer_color) {
		this.mplayer_color = mplayer_color;
	}
	/**
	 * @param mPlayer
	 */
	public SonyXperiaXZ(MusicPlayer mPlayer) {
		super();
		this.mPlayer = mPlayer;
	}
	public SonyXperiaXZ() {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		System.out.println(this.mPlayer.getClass().getSimpleName()+" Player color is" + this.mplayer_color);
		System.out.println(this.mPlayer.getClass().getSimpleName()+" Player version is" + this.mplayer_version);
		
	}

}
