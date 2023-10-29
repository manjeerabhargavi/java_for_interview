package com.java8.practicejava.problemsolving.strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingAnagrams8 {
    public static void main(String args[]) {
    	 String[] wordArray = {"eat", "tea", "tan", "ate", "nat", "bat"};
         List<List<String>> result = groupAnagrams(wordArray);

         for (List<String> group : result) {
             System.out.println(group);
         }	
    	
    }
    public static List<List<String>> groupAnagrams(String[] words){
    	Map<String,List<String>>anagramGroups = Arrays.stream(words)
    			                                      .collect(Collectors.groupingBy(GroupingAnagrams8::generateKey));
    	return new ArrayList<>(anagramGroups.values());
    }
    
    private static String generateKey(String word) {
    	char[] chars = word.toCharArray();
    	Arrays.sort(chars);
    	return new String(chars);
    }
}
