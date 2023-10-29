package com.java8.practicejava.problemsolving.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MissingNumber {
  public static void main(String args[]) {
	  int[] array = {1,2,3,5};
	  int n = array.length +1;
	  int expectedSum = IntStream.rangeClosed(1,n).sum();
	  System.out.println("Expected Sum::"+expectedSum);
	  int actualSum = Arrays.stream(array).sum();
	  System.out.println("Actual Sum::"+actualSum);
	  int missingNumber = expectedSum-actualSum;
	  System.out.println("The missing number is::"+missingNumber);
			  
  }
}
