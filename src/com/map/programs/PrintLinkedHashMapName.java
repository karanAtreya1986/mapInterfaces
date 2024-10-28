package com.map.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintLinkedHashMapName {

	public static void main(String[] args) {

		LinkedHashMap<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
		m1.put(2, null);
		m1.put(2, null);
		m1.put(3, null);
		m1.put(null, null);
		m1.put(null, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
		m1.put(null, "tiger");
		m1.put(null, "hero");

		// output comes in random order, in dictionary form.
		// same order for entering and retrieval.
		System.out.println(" linked hash map is " + m1);
	}

}
