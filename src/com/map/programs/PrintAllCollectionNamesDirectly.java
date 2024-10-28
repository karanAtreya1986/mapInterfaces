package com.map.programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrintAllCollectionNamesDirectly {

	public static void main(String[] args) {

		// all maps return dictionary of values when printing them directly.

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

		System.out.println("hash map " + m1);

		LinkedHashMap<Integer, String> m11 = new LinkedHashMap<>();
		m11.put(1, "karan");
		m11.put(1, "karan");
		m11.put(2, null);
		m11.put(2, null);
		m11.put(3, null);
		m11.put(2, null);
		m11.put(3, null);
		m11.put(null, null);
		m11.put(null, null);
		m11.put(4, "robic");
		m11.put(4, "rogrycbic");
		m11.put(null, "tiger");
		m11.put(null, "hero");

		System.out.println("linked hash map " + m11);

		TreeMap<Integer, String> m111 = new TreeMap<>();
		m111.put(1, "karan");
		m111.put(1, "karan");
		m111.put(2, null);
		m111.put(2, null);
		m111.put(3, null);
		m111.put(2, null);
		m111.put(3, null);
//		m111.put(null, null);
//		m111.put(null, null);
		m111.put(4, "robic");
		m111.put(4, "rogrycbic");
//		m111.put(null, "tiger");
//		m111.put(null, "hero");

		System.out.println("tree  map " + m111);

		Hashtable<Integer, String> m1111 = new Hashtable<>();
		m1111.put(1, "karan");
		m1111.put(1, "karan");
//		m1111.put(2, null);
//		m1111.put(2, null);
//		m1111.put(3, null);
//		m1111.put(2, null);
//		m1111.put(3, null);
//		m1111.put(null, null);
//		m1111.put(null, null);
		m1111.put(4, "robic");
		m1111.put(4, "rogrycbic");
//		m1111.put(null, "tiger");
//		m1111.put(null, "hero");

		System.out.println("hash table " + m1111);
	}

}
