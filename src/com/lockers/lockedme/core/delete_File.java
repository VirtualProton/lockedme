package com.lockers.lockedme.core;

import java.io.File;
import java.util.Scanner;

import com.lockers.lockedme.storage.Storage;

public class delete_File {
	File path;
	
	@SuppressWarnings("resource")
	delete_File(){
		path = new File(Storage.getPath());
		System.out.println("Enter file name:");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			delete(sc.nextLine());
		}else {
			System.out.println("Thank you..!");
			System.exit(0);
		}
			
	}
	private void delete(String file_name) {
		// TODO Auto-generated method stub
		File file = new File(path+"/"+file_name);
		if (file.exists()) {
			if(file.getName().equals(file_name)) {
				if(file.delete()) {
					System.out.print(file.getName()+" deleted");
				}
			  }
			}else {
				System.out.print("File not exist");
		}
	}
}
