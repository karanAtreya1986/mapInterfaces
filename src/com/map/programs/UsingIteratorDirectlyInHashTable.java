package com.map.programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class UsingIteratorDirectlyInHashTable {

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

		// this is directly using iterator from entry set()
//		Iterator<Entry<Integer, String>> it1 = m1.entrySet().iterator();
//		while (it1.hasNext()) {
//			Entry<Integer, String> e1 = it1.next();
//			Integer i1 = e1.getKey();
//			String s1 = e1.getValue();
//			System.out.println(i1 + " " + s1);
//		}

		// what happens if we use this way.
		// we get null pointer exception.
		// Problem:
		// b1 is only initialized once: In this code, you are assigning the result of
		// it1.hasNext() to b1 just once before entering the while loop.

		// This means b1 is true only if there's a next element when the loop starts,
		// but b1 never gets updated after each iteration. The hasNext() method isn't
		// called again, so after the first iteration, b1 remains true, and the loop
		// continues without checking if there are more elements.
		// After exhausting the iterator: When there are no more elements left in the
		// iterator, you still call it1.next() (because b1 is still true), which will
		// result in a NoSuchElementException or NullPointerException, because it1 is
		// exhausted, and there are no more entries to iterate over.

		// Correct approach:
		// You need to call it1.hasNext() inside the while condition to check for the
		// availability of the next element on each iteration. This is why your original
		// approach worked correctly.
		Iterator<Entry<Integer, String>> it1 = m1.entrySet().iterator();
		boolean b1 = it1.hasNext();

		while (b1) {
			Entry<Integer, String> e1 = it1.next();
			Integer i1 = e1.getKey();
			String s1 = e1.getValue();
			System.out.println(i1 + " " + s1);
		}
	}
}
