/**
 * 
 */
package com.infocampus.mobilecentre.learn.spring.mobileapp.v5_annotation;

import org.springframework.stereotype.Component;

/**
 * @author Nikhil
 *
 */
@Component
public class GooglePlayMusic implements MusicPlayer {

	public GooglePlayMusic() {
		System.out.println(this.getClass().getSimpleName()+" is download from the Google playstore.");
	}

	/* (non-Javadoc)
	 * @see com.infocampus.mobilecentre.learn.spring.mobileapp.v4_XmlCnfg.MusicPlayer#playMusic()
	 */
	@Override
	public void playMusic() {
		System.out.println("Play on the "+ this.getClass().getSimpleName());
	}

}