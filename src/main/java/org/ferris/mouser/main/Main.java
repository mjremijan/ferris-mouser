package org.ferris.mouser.main;

import java.util.Timer;

/**
 * The entry point for this application
 * 
 * @author Michael Remijan mjremijan@yahoo.com @mjremijan
 */
public class Main 
{
	/**
	 * @param args
	 */
	public static void main(String[] args) {
        Timer timer = new Timer();	 
        timer.schedule(new MouseMoveTask(), 0, 1000 * 60);
	}
}
