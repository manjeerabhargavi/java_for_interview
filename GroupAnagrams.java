package com.java8.practicejava.problemsolving.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {
	public static void main(String args[]) {
		 String[] wordArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
	        List<List<String>> result = groupAnagrams(wordArray);

	        for (List<String> group : result) {
	            System.out.println(group);
	        }
	}
   public static List<List<String>> groupAnagrams(String[] words){
	   Map<String,List<String>>anagramGroups = new HashMap<>();
	   // Generate a key for the word by sorting its characters
	   for(String str:words) {
		   char[]charArray = str.toCharArray();
		   Arrays.sort(charArray);
		   String key = new String(charArray);
		   // If the key doesn't exist in the map, create a new list
		   anagramGroups.putIfAbsent(key, new ArrayList<>());
		   // Add the word to the list corresponding to the key
		   anagramGroups.get(key).add(str);
		
	   }
	// Convert the values (lists of anagrams) from the map to a list
	   return new ArrayList<>(anagramGroups.values());
   }
}
