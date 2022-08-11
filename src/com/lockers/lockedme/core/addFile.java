package com.lockers.lockedme.core;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.lockers.lockedme.storage.Storage;

public class addFile {
	
	File file;
	
	public addFile() throws IOException {
		System.out.println("Eneter file name followed by valid extension e.g(example.txt)");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			createFile(sc.nextLine());
		}else {
			System.out.println("Thank you..!");
			System.exit(0);
		}
		
	}
	 @SuppressWarnings("unused")
	private void createFile(String fileName) throws IOException {
		 file = new File(Storage.getPath()+"/"+fileName);
		 if(file.createNewFile()) {
			 writefile();
			 System.out.println(file.getName()+" created successfully");
		 }else {
			 System.out.println("File already exist");
		 }
	 }

	private void writefile() throws IOException {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		FileWriter filewriter = new FileWriter(file);
		System.out.println("Enter data: ");
		if(sc.hasNext()) {
			filewriter.write(sc.nextLine());
		}else {
			System.out.println("Thank you..!");
			System.exit(0);
		}
		filewriter.close();
	}
}
