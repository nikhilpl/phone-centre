package com.infocampus.mobilecentre.learn.spring.mobileapp.v4_XmlCnfg;
/**
 * 
 * @author Nikhil
 * 
 * Dependency Injection using POJO class(Setter and Getter methods)
 *
 */
public class Redmi4 implements Mobile {
	
	private MusicPlayer player;
	private int player_version;
	private String player_color;
	
	

	/**
	 * @return the player
	 */
	public MusicPlayer getPlayer() {
		return player;
	}
	/**
	 * @param player the player to set
	 */
	public void setPlayer(MusicPlayer player) {
		this.player = player;
	}
	/**
	 * @return the player_version
	 */
	public int getPlayer_version() {
		return player_version;
	}
	/**
	 * @param player_version the player_version to set
	 */
	public void setPlayer_version(int player_version) {
		this.player_version = player_version;
	}
	/**
	 * @return the player_color
	 */
	public String getPlayer_color() {
		return player_color;
	}
	/**
	 * @param player_color the player_color to set
	 */
	public void setPlayer_color(String player_color) {
		this.player_color = player_color;
	}
	public Redmi4() {
		System.out.println(this.getClass().getSimpleName()+" mobile is being constructor.");
	}
	@Override
	public void switchOnTheMobile() {
		System.out.println(this.getClass().getSimpleName()+" mobile is Switch on... :-).");
		
		System.out.println(this.player.getClass().getSimpleName()+" version is "+ this.player_version);
		System.out.println(this.player.getClass().getSimpleName()+" color is "+ this.player_color);
		
		
	}

}
