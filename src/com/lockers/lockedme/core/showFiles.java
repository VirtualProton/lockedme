package com.lockers.lockedme.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import com.lockers.lockedme.storage.Storage;

public class showFiles {
		List<String> list = new ArrayList<String>();
		
	//get files.1	
	private void getfiles() {
		// TODO Auto-generated method tuber		
		//System.out.println(Storage.getPath());
		File path = new File(Storage.getPath());
		if(path.exists()) {
			File[] file = path.listFiles();
				for(File files : file) {
						list.add(files.getName());
					}
			}
			
		}
	
	//display files
	public void displayFiles() {
		getfiles();
		if(!list.isEmpty()) {
			//sorting files
			Collections.sort(list, new ignorecase());
			System.out.println("Available files are: ");
			Iterator<String> item = list.iterator();
			while(item.hasNext()) {
				System.out.println(item.next());
			}
		}else {
			System.out.println("Directory is empty");
		}
		
	}
}
