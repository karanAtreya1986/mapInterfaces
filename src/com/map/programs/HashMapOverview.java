package com.map.programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapOverview {

//	Best when working with databases when key and value is involved.
//	Implementation classes of map-
//	Hash map, linked hash map, tree map, hash table.
//	Each key value pair in map is called as Entry.
//	Map contains only unique keys.
//	Methods in map-
//	Put() – for adding.
//	Putall() – same as addall()
//	Remove()
//	Get()
//	Containskey() – if key is present or not.
//	Keyset()
//	Entryset()
//	Entry is sub interface of Map.
//	Map.Entry -> is the way to access Entry.
//	Provides methods to get the key and value.
//	Getkey()
//	Getvalue()

	public static void main(String[] args) {

		// duplicates allowed.
		// null value allowed.
		// key name can be null.
		// we cannot keep key blank - compile error - The method
		// put(Integer, String) in the type Map<Integer,String> is
		// not applicable for the arguments (String)
		// we cannot keep value blank - compile error - Syntax error on token
		// ",", Expression expected after this token
		// if same key has more than one value, the latest value will override all other
		// values.
		// any number of null key allowed and any number of null value allowed.
		// no ordering in output.

		// Under map all the implementation classes of map are present.
		// Keys will be unique, but value can be same or different or null or anything.
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

		// iterate map
		// simple for each wont work for map - compile time error - Can only iterate
		// over an array or an instance of java.lang.Iterable
//		for (String string : m1) {
//
//		}

		// this is the loop we need to use
		// this also does not work now - compile error - Map.entry cannot be resolved to
		// a type
		// Type mismatch: cannot convert from element type Map.Entry<Integer,String> to
		// Map.entry
//		for (Map.entry m : m1.entrySet()) {
//
//		}

		// Entry-
		// Sub interface of map.

		// this is the correct for each for map.
		for (Entry<Integer, String> s1 : m1.entrySet()) {
			Integer i1 = s1.getKey();
			String s2 = s1.getValue();
			System.out.println(i1 + " " + s2);

		}

	}

}
