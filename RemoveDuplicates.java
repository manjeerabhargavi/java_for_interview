package com.java8.practicejava.problemsolving.arrays;

import java.util.Arrays;

public class RemoveDuplicates {
	public static void main(String args[]) {
		 Integer[] array = {1, 2, 2, 3, 4, 4, 5, 6, 6}; 
		 //using java 8 streams to remove duplicates and collect into new array
		 Integer[]uniqueArray = Arrays.stream(array)
				                      .distinct()
				                      .toArray(Integer[]::new);
		 System.out.println("Original Array::"+Arrays.toString(array));
		 System.out.println("Arrays with Duplicates Removed::"+Arrays.toString(uniqueArray));
				                      
	}

}
