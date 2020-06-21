package com.javaexamples;

public class EqualsMethod { 
    public static void main(String[] args) 
    { 
        String s1 = new String("HELLO"); 
        String s2 = new String("HELLO"); 
        System.out.println(s1 == s1); 
        System.out.println(s1.equals(s2)); 
    } 
} 