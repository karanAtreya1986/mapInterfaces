package com.map.programs;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;

public class ValuesMethodInLinkedHashMap {

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

		// returns collection.
		// all methods like iterator can be used.
		// returns output as list of values.
		// no ordering in output, unique values only.
//		Collection<String> c1 = m1.values();
//		System.out.println(c1);

		// use for each loop to print the values
//		Collection<String> c1 = m1.values();
//		for (String string : c1) {
//			System.out.println(string);
//		}

		// can use the iterator once converted to collection.
		Collection<String> c1 = m1.values();
		Iterator<String> it1 = c1.iterator();
		while (it1.hasNext()) {
			String s1 = it1.next();
			System.out.println(s1);
		}

	}

}
