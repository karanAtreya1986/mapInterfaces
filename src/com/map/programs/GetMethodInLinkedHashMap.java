package com.map.programs;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class GetMethodInLinkedHashMap {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<>();
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
//		m1.put(, "tiger");
//		m1.put(5, );

		// use get method and pass in keys, we get the value for that key.
		String s1 = m1.get(null);
		System.out.println(s1);
	}

}