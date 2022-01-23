package com.company;

import java.io.File;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
	// write your code here
        boolean matchFound=false;
        Scanner keyBoardInput = new Scanner(System.in);
        do {//for taking repeated inputs
            System.out.println("enter the name of the file");

            String input = keyBoardInput.nextLine();

            // address of files or folder where to search
            File file = new File("/home/khajahs/Downloads");
            //Get all the names of the files present in the working directory
            String[] fileList = file.list();

            for (String fileNames : fileList) {
                // Creating a pattern of the file to be searched
                Pattern pattern = Pattern.compile(input);
                // Searching above pattern in the list of files
                Matcher matcher = pattern.matcher(fileNames);
                matchFound = matcher.find();
                //if match is found come out of the loop
                if (matchFound)
                    break;
            }

            if (matchFound) {
                System.out.println("Match found" + file.getAbsolutePath());
            } else {
                System.out.println("Match not found");
            }


        }  while (true) ;
    }
}
