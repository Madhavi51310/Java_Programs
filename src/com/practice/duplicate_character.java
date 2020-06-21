package com.practice;

public class duplicate_character {

	public static void main(String[] args) {
		String s ="madhavi";
		char ch[] = new char[s.length()];
		
		for(int i=0; i<=s.length(); i++) {
			ch[i]=s.charAt(i);
		
		for(int j=0;j<s.length()-1;j++) {
			int count=0;
			for(int k=j+1; k<s.length();k++) {
				if(ch[j]==ch[k]) {
					count++;
				}
			}
		
			if(count!=0) {
				System.out.println(ch[i] + "is having duplicate char");
				System.out.println(ch[i] + "is repeted" +count+ "no of times");
			}
		}
		}
	}

	

}
