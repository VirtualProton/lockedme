package com.lockers.lockedme.storage;

import java.io.File;


public class Storage {
	 private static String  path ;
	@SuppressWarnings("static-access")
	public void setPath(String path)  {
		File path1 = new File(path); 
		this.path = path1.toString();
		if(path1.exists()) {
			this.path = path1.toString();
		}else {
			if(path1.mkdir()) {
				this.path = path;
			}else {
				System.out.println("Creating Directory unsucessful");
			}
		}
	}
	
	public static  String getPath() {
		return path;
	}
	
}
