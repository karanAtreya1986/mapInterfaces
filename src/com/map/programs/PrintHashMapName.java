package com.map.programs;

import java.util.HashMap;
import java.util.Map;

public class PrintHashMapName {

	public static void main(String[] args) {

		// Hash map takes more memory than array list because it stores value in key
		// value pair.

		HashMap<Integer, String> m1 = new HashMap<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
		m1.put(2, null);
		m1.put(2, null);
		m1.put(null, null);
		m1.put(null, null);
		m1.put(3, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
		m1.put(null, "tiger");
		m1.put(null, "hero");

		// output comes in random order, in dictionary form.
		System.out.println("hash map is " + m1);
	}

}
