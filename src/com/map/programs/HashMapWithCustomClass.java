package com.map.programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapWithCustomClass {

	public static void main(String[] args) {

		HashMap<Integer, CustomClassBook> h1 = new HashMap<>();

		CustomClassBook b1 = new CustomClassBook(0, null, null, "tiger", 5000);
		CustomClassBook b2 = new CustomClassBook(0, null, null, "tiger", 5000);
		CustomClassBook b3 = new CustomClassBook(1, "hello", "nelson", "tiger", 55000);
		CustomClassBook b4 = new CustomClassBook(2, "jinder", "mandela", "lion", 15000);

		h1.put(1, b4);
		h1.put(2, b2);
		h1.put(3, b3);
		h1.put(4, b1);

		// the way we have put in hash map, it comes out in same way.
//		for (Entry<Integer, CustomClassBook> string : h1.entrySet()) {
//			Integer i1 = string.getKey();
//			CustomClassBook cb1 = string.getValue();
//			System.out.println(
//					i1 + " " + cb1.author + " " + cb1.id + " " + cb1.name + " " + cb1.publisher + " " + cb1.quantity);
//		}

		// what will happen if we write the object name and not use the dot operator.
		// it prints memory address, as now customclassbook is normal classes and
		// objects of java and not collections.
		for (Entry<Integer, CustomClassBook> string : h1.entrySet()) {
			Integer i1 = string.getKey();
			CustomClassBook cb1 = string.getValue();
			System.out.println(i1 + " " + cb1);
		}
	}

}
