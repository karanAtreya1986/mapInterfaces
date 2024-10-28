package com.map.programs;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

public class KeySetMethodHashTable {

	public static void main(String[] args) {

		Hashtable<Integer, String> m1 = new Hashtable<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
//	m1.put(2, null);
//	m1.put(2, null);
//	m1.put(3, null);
//	m1.put(null, null);
//	m1.put(null, null);
//	m1.put(2, null);
//	m1.put(3, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
//	m1.put(null, "tiger");
//	m1.put(null, "hero");
//	m1.put(, null);
//	m1.put(199, )

		// we convert to set and can use all methods of set
//		Set<Integer> e1 = m1.keySet();
//		//prints list of keys.
//		System.out.println(e1);

		// lets try to use iterator after set conversion
		// prints the key values in normal form
		Set<Integer> e1 = m1.keySet();
		Iterator<Integer> i1 = e1.iterator();
		while (i1.hasNext()) {
			Integer i2 = i1.next();
			System.out.println(i2);
		}
	}

}
