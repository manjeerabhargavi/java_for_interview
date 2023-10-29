package com.java8.practicejava.problemsolving.strings;

import java.util.Arrays;
import java.util.Scanner;

public class MaxDifferenceInWords {
  public static int maxDifference(String word) {
	  char[]sortedChars = word.toCharArray();
	  Arrays.sort(sortedChars);
	  char[] charArray = word.toCharArray();
	  int maxDiff = 0;
	  //Iterate thru the characters in Ashish's word
	  for(int i=0;i<charArray.length;i++) {
		  	if(charArray[i]!=sortedChars[i]) {
		  		maxDiff++;
		  	}
	  }
	  return maxDiff;
  }
  
  public static void main(String args[]) {
	  Scanner scanner = new Scanner(System.in);
	  int n = scanner.nextInt();
	  
	  scanner.nextLine();
	  //initialize 
	  
  }
}
