package com.java8.practicejava.problemsolving.arrays;

public class SubArraySum {
  public static void main(String args[]) {
	  int[] A = {1, 2, 3, 4, 5};
	  int S = 9;
      
	  int[] result = findSubArray(A,S);
	  if(result[0]==-1) {
		  System.out.println("No subarray found with sum " + S);
		  }
	  else {
		  System.out.println("Subarray found from index ::"+result[0] + " to "+ result[1]);
	  }
    }

private static int[] findSubArray(int[] A, int S) {
	 int left = 0;
     int currentSum = 0;

     for (int right = 0; right < A.length; right++) {
         currentSum += A[right];

         while (currentSum > S) {
             currentSum -= A[left];
             left++;
         }

         if (currentSum == S) {
             return new int[]{left + 1, right + 1}; // 1-based indexing
         }
     }

     return new int[]{-1}; // Return -1 if no subarray is found

}
}
