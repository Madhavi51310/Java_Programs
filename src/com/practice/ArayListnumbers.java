package com.practice;

import java.util.ArrayList;
import java.util.Iterator;

public class ArayListnumbers {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(1000);
		list.add(10000);
		list.add(100000);
		list.add(1000);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
