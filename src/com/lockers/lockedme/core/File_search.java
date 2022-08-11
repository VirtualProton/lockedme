package com.lockers.lockedme.core;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.lockers.lockedme.storage.Storage;

public class File_search {
	File path;
	List<String> list = new ArrayList<String>();
	
	
	public File_search() throws IOException {
		path = new File(Storage.getPath());
		System.out.println("Search: ");
		Scanner sc = new Scanner(System.in);
		if(sc.hasNext()) {
			search(sc.nextLine());
		}else {
			System.out.println("Thank you..!");
			System.exit(0);
		}
		
		if(!list.isEmpty()) {
			//sorting files
			Collections.sort(list, new ignorecase());
			System.out.println(list.size()+" result found:");
			Iterator<String> item = list.iterator();
			while(item.hasNext()) {
				System.out.println(item.next());
			}
		}else {
			System.out.println("No result found...");
		}
	}
	//filter
	private FilenameFilter filter(String userInput) {
		FilenameFilter filenameFilter = new FilenameFilter() {
			@Override
			public boolean accept(File path, String name) {
				// TODO Auto-generated method stub
				return name.startsWith(userInput);
			}
			
		};
		return filenameFilter;
	}
	
	
	private void search(String userInput) throws IOException {
		File[] files = path.listFiles(filter(userInput));
		for(File file : files){
			BasicFileAttributes attr =Files.readAttributes(file.toPath(),BasicFileAttributes.class ) ;
			String str ="file name: "+file.getName()+"\t size: "+(file.length()/1000)+"Kb"+"\tcreated on:"+attr.creationTime();
			list.add(str);
		}
	}
	
}
