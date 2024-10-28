package com.map.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class IterateOverHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> m1 = new HashMap<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
		m1.put(2, null);
		m1.put(2, null);
		m1.put(3, null);
		m1.put(2, null);
		m1.put(3, null);
		m1.put(null, null);
		m1.put(null, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
		m1.put(null, "tiger");
		m1.put(null, "hero");
		
		//foreach loop for iterating
		//different slightly
//		for (Entry<Integer, String> string : m1.entrySet()) {
//			Integer i1=string.getKey();
//			String s1=string.getValue();
//			System.out.println(i1 + " " + s1);
//		}
		
		//no list iterator for maps.
//		m1.list
		
		//no iterator for maps.
//		m1.it
		
		//no enumeration for maps
//		m1.elem
	}

}
