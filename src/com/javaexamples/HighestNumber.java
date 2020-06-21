package com.javaexamples;

public class HighestNumber {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 30;
		
		if(a>b && a>c && a>d)
			
			System.out.println("a is greater");
		
		else if(b>a && b>c && b>d)
			
			System.out.println("b is greater");
		
		else if (c>a && c>b && c>d)
			
			System.out.println("c is greater");
		
        else if (d>a && d>b && d>c)
			
			System.out.println("c is greater");
		
		else
			
			System.out.println("Two or More values are same");
			

	}

}
