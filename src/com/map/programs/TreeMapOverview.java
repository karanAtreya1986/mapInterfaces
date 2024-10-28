package com.map.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapOverview {

	// null values are allowed in tree map.
	// tree map cannot have even one single null key.
	// returns in alphabetical order of keys.

	public static void main(String[] args) {

		TreeMap<Integer, String> m1 = new TreeMap<>();
		m1.put(4, "karan");
		m1.put(5, "karan");
		m1.put(2, null);
		m1.put(2, null);
		m1.put(3, null);
		m1.put(2, "robic");
		m1.put(3, "rogrycbic");
//		m1.put(null, null);
//		m1.put(null, null);
//		m1.put(null, "tiger");
//		m1.put(null, "hero");
//		m1.put(, "tiger");
//		m1.put(5, );

		// this is the correct for each for map.
		for (Entry<Integer, String> s1 : m1.entrySet()) {
			Integer i1 = s1.getKey();
			String s2 = s1.getValue();
			System.out.println(i1 + " " + s2);

		}

	}

}
