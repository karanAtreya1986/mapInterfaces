package com.map.programs;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class GetMethodInHashMap {

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

		// get to pass in the key and it will get the value for that key.
		String s1 = m1.get(3);
		System.out.println(s1);

	}

}
