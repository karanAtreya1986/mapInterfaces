package com.map.programs;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class PutAllMethodHashMapWithLinkHashMap {

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
//		m1.put(, "tiger");
//		m1.put(5, );

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
		m11.put(4, "wesele");
		m11.put(4, "grobic");
		m11.put(null, "tiger");
		m11.put(null, "pointer");
//		m1.put(, "tiger");
//		m1.put(5, );

		// put all requires another map only.
		// that map should have same combination and data type of key and value.
		// adds right hand side into left hand side.
		// return type is void.
		m1.putAll(m11);

		System.out.println("added into m1 " + m1);

		System.out.println("added from m11 " + m11);

	}

}