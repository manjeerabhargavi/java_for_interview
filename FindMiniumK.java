package com.java8.practicejava.problemsolving.strings;
/**
 * . Given an array of integers. You take an integer k, and go on adding the elements of the array consecutively.
After each addition, the sum must be at least +1. Find least possible value of k satisfying this condition.
Example - take this array A = [2, -4, 3, 1]
Suppose k = 3
3 + A[0] = 3 + 2 = 5
5 + A[1] = 5 +(-4) = 1
1 + A[2] = 1 + 3 = 4
4 + A[3] = 4 + 1 = 5

For k = 3, each sum is at least +1. No value of k smaller than 3 will satisfy this condition.
So, answer is k = 3
 */
public class FindMiniumK {
	public static void main(String args[]) {
		int[] array = {1, -2, 3, -4, 5};

        int minK = findMinimumK(array);
        System.out.println("The minimum value of k is: " + minK);
	}
	public static int findMinimumK(int[] array) {
		int currentSum = 0;
		int minK = 0;
		for(int num:array) {
			currentSum = currentSum+num;
			if(currentSum<1) {
				minK = minK-1+currentSum;
				currentSum = 1;
			}
		}
		return minK;
	}
	
  
}
