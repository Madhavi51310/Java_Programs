package com.javaexamples;

import java.util.Scanner;

public class kishore_swapNumbers {
	public static void main(String[] args) {
	/*	int a=100;
		int b=200;
	int temp = 0;
	temp=a;
	a=b;
	b=temp;
	
		a=a+b;//a=300
		b=a-b;//b=100
		a=a-b;//a=200
		System.out.println(a);
		System.out.println(b);*/
		int counter=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number");
		int a=sc.nextInt();
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
             counter++;
			}
		}
			if(counter==0) {
				System.out.println("num is prime");
				}
			else
				System.out.println("not a prime num");
			}
	}
	
