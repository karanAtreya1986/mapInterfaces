package com.map.programs;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class RemoveMethodTreeMapExampleTwo {

	public static void main(String[] args) {

		// same working as hash map.

		TreeMap<Integer, String> m1 = new TreeMap<>();
		m1.put(1, "karan");
		m1.put(1, "karan");
		m1.put(2, null);
		m1.put(2, null);
		m1.put(3, null);
//		m1.put(null, null);
//		m1.put(null, null);
		m1.put(4, "robic");
		m1.put(4, "rogrycbic");
//		m1.put(null, "tiger");
//		m1.put(null, "hero");

		// pass in the key and value to remove
		// returns true if successfully removed, else false.
//		boolean b1 = m1.remove(3, null);
//		System.out.println(b1);
//
//		System.out.println(m1);

		// try removing key which is duplicate
		// all keys with number 2 are removed.
//		boolean b1 = m1.remove(2, null);
//		System.out.println(b1);
//
//		System.out.println(m1);

		// try removing key which is not present but value is present.
		// returns false and nothing removed.
//		boolean b1 = m1.remove(3432423, null);
//		System.out.println(b1);
//
//		System.out.println(m1);

		// try removing value which is not present but key is present.
		// returns false and nothing removed.
//		boolean b1 = m1.remove(2, "rrewer324777");
//		System.out.println(b1);
//
//		System.out.println(m1);

		// try removing non existent key and none existent value.
		// this will throw class cast exception in tree map.
		boolean b1 = m1.remove("wewewqe213123#@$@#$", "rrewer324777");
		System.out.println(b1);

		System.out.println(m1);

		// try removing non existent key and none existent value.
		// returns false and nothing removed.
		// output in ascending order of keys.
//		boolean b1 = m1.remove(45435435, "rrewer324777");
//		System.out.println(b1);
//
//		System.out.println(m1);
	}

}