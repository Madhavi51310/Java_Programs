package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListString {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Madhavi");
		list.add("Sampath");
		list.add("kumar");
		list.add("Yarabarla");
		list.add("Madhavi");
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		

	}

}
