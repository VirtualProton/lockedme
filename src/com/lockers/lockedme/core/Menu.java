package com.lockers.lockedme.core;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.*;

public class Menu {
  @SuppressWarnings("resource")

public void main_menu() throws IOException {
	  int opt = 0;
		while(true){
			try {
			System.out.println("\n\n<------ Main Menu----->\n");
			System.out.println("1. Shows all files\n2. File Operations\n3. Exit");
			System.out.println("Choose any option:");
			Scanner sc = new Scanner(System.in);
			if(sc.hasNext()) {
				opt = sc.nextInt();
			}else {
				System.out.println("Thank you..!");
				System.exit(0);
			}
			
			try {
				switch(opt) {
				case 1:
					try {
						showFiles files = new showFiles();
							files.displayFiles();
						//showfiles.files();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				case 2:
					sub_menu();
					break;
				case 3:
					System.out.print("Thank you..!");
					System.exit(0);
				default:
					System.out.println("Please select option from above menu");
					System.out.println("<-------------------------------->\n\n");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }catch(InputMismatchException e) {
			  System.out.println("Invalid input ...!\n\n");
		  }
		   
		}
  }

  private void sub_menu() throws IOException {
	// TODO Auto-generated method stub
	  int opt = 0;
		while(true){
			try {
			System.out.println("\n<------ File Operation----->");
			System.out.println("1. Add a file\n2. Delete a file\n3. Search file\n4. Return to main menu");
			Scanner sc = new Scanner(System.in);
			System.out.print("Choose any option:");
			if(sc.hasNext()) {
				opt = sc.nextInt();
			}else {
				System.out.println("Thank you..!");
				System.exit(0);
			}
			switch(opt) {
			case 1:
				//addFile();
				addFile addfile = new addFile();
				break;
			case 2:
				delete_File delete_file = new delete_File();
				break;
			case 3:
				//searchFile();
				//Search_file File= new Search_file();
				File_search search = new File_search();
				break;
			case 4:
				main_menu();
			default:
				System.out.println("Invalid input ...!\n");
				System.out.println("<-------------------------------->"+"\n\n");
			}
		  }catch(InputMismatchException e) {
			  System.out.println("Invalid input ...!\n\n");
		  }
			
		}
  }
}
