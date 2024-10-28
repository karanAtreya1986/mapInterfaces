package com.map.programs;

import java.util.TreeMap;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class IterateOverHashTable {
	
	public static void main(String[] args) {
		
		Hashtable<Integer, String> m1 = new Hashtable<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
//		m1.put(2, null);
//		m1.put(2, null);
//		m1.put(3, null);
//		m1.put(2, null);
//		m1.put(3, null);
//		m1.put(null, null);
//		m1.put(null, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
//		m1.put(null, "tiger");
//		m1.put(null, "hero");

		// foreach loop for iterating
		// different slightly
//		for (Entry<Integer, String> string : m1.entrySet()) {
//			Integer i1 = string.getKey();
//			String s1 = string.getValue();
//			System.out.println(i1 + " " + s1);
//		}

		// no list iterator for maps.
//		m1.list

		// no iterator for maps.
//		m1.iter

		
		//  enumeration for hash table works
		Enumeration<String> en1=m1.elements();
		while(en1.hasMoreElements()) {
			String s1=en1.nextElement();
			System.out.println(s1);
		}
	}
	}


