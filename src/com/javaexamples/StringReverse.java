package com.javaexamples;

public class StringReverse {
	
	public static void main(String[] args) {
		String a = "MADHAVI";
		char[] t1 = a.toCharArray();
		for(int i = t1.length-1; i>=0; i--)
		{
			System.out.print(t1[i]);
	    }
		
  }

}
