package com.java8.practicejava.problemsolving.strings;

public class ConsecutiveCharacters {
   public static void main(String args[]) {
	   String[] strings = {"aaa", "abc", "abba", "aaaaa"};
	   for(String str : strings) {
		   int modifications = minModifications(str);
		   System.out.println("For string::"+str+"::Modifications::"+modifications);
	   }
	   
   }
   	public static int minModifications(String str) {
   		int minModifications = 0;
   		char prevChar = str.charAt(0);
   		
   		for(int i=1;i<str.length();i++) {
   			char currentChar = str.charAt(i);
   			if(currentChar == prevChar) {
   				minModifications++;
   				currentChar = (currentChar == prevChar)?(char)prevChar++:currentChar;
   			}
   			prevChar = currentChar;
   		}
   		return minModifications;
   	}
}
