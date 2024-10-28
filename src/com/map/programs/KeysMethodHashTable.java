package com.map.programs;

import java.util.Enumeration;
import java.util.Hashtable;

public class KeysMethodHashTable {

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

		// this will return the keys in the hash table.
		Enumeration<Integer> e1 = m1.keys();
		while (e1.hasMoreElements()) {
			Integer i1 = e1.nextElement();
			System.out.println(i1);
		}
	}

}
