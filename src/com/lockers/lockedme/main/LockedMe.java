package com.lockers.lockedme.main;

import java.io.IOException;

import com.lockers.lockedme.core.Menu;
import com.lockers.lockedme.storage.Storage;

public class LockedMe {
	public static void main(String [] arg) throws IOException {
		System.out.println("**********************************");
		System.out.println("* Welcome to LockedMe.com        *");
		System.out.println("*                                *");
		System.out.println("* Deoveped by : Pritham Biswas   *");
		System.out.println("*                                *");
		System.out.println("* Email ID : impritham@gmail.com *");
		System.out.println("**********************************");
		Storage storage = new Storage();
		storage.setPath(System.getProperty("user.dir")+"/files");
		Menu menu = new Menu();
		menu.main_menu();
	}
}
