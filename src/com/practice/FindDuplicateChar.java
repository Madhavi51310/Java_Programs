package com.practice;

import java.util.HashSet;

public class FindDuplicateChar {
	
	public static void main(String[] args) {
		String s1 = "testingmasters";
		
		HashSet<Character> ch = new HashSet<Character>();
		
		for(int i=0; i<=s1.length()-1;i++) {
			
			
			char ch1 = s1.charAt(i);
			if(ch.contains(ch1)) {
				System.out.println(ch1);
			}
			else
				ch.add(ch1);
		}
		
	}

}
