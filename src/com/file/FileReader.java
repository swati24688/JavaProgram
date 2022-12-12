package com.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) {
		System.out.println("Enter the file using relative path. (e.g data/dictionary.txt)");
		Scanner scan = new Scanner(System.in);
		String filepath = scan.nextLine();
		doesFileExist(filepath);
	}

	private static void doesFileExist(String filepath) {
		
		try {
			File file = new File(filepath);
			Scanner sc = new Scanner(file);
			
			 while (sc.hasNextLine()) {
			      System.out.println("-----------------------");
				  String line = sc.nextLine();   //Apple-a fruit,a tech firm
			      String [] wordArray = line.split("-");   // [Apple , a fruit,a tech firm]
			      System.out.println(wordArray[0]);
			      String [] meaningArray = wordArray[1].split(",");
			      for(int i=0 ; i < meaningArray.length ; i++) {
			    	  System.out.println(meaningArray[i]);
			      }			      
			      System.out.println("---------------------");			}
		} catch (FileNotFoundException e) {
			System.out.println("File does not exists");
		}
		
	}

}
