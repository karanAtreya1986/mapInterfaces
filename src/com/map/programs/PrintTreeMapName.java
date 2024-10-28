package com.map.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrintTreeMapName {

	public static void main(String[] args) {

		TreeMap<Integer, String> m1 = new TreeMap<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
		m1.put(2, null);
		m1.put(2, null);
//		m1.put(null, null);
//		m1.put(null, null);
//		m1.put(null, null);
//		m1.put(null, null);
		m1.put(3, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
//		m1.put(null, "tiger");
//		m1.put(null, "hero");

		// output comes in ascending order of keys, in dictionary form.
		System.out.println("hash map is " + m1);
	}

}
