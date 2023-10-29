package com.java8.practicejava.problemsolving.strings;

import java.util.stream.IntStream;

public class EggDropProblem {
	 public static int eggDrop(int eggs,int floors) {
		 //Create a 2D array to store the results of subproblems
		 int[][]dropPossibility = new int[eggs+1][floors+1];
		 
		 //Base case : If there are no floors and only one floor is present
		 IntStream.rangeClosed(1, floors).forEach(fl->{
			 dropPossibility[fl][0] = 0;
			 dropPossibility[fl][1] = 1;
		 });
		return floors;
		 
		 
	 }

}
