package com.map.programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapWithCustomClass {

	public static void main(String[] args) {

		// working normally for me without comparable also.

		TreeMap<Integer, CustomClassBook> h1 = new TreeMap<>();

		CustomClassBook b1 = new CustomClassBook(0, null, null, "tiger", 5000);
		CustomClassBook b2 = new CustomClassBook(0, null, null, "tiger", 5000);
		CustomClassBook b3 = new CustomClassBook(1, "hello", "nelson", "tiger", 55000);
		CustomClassBook b4 = new CustomClassBook(2, "jinder", "mandela", "lion", 15000);

		h1.put(1, b4);
		h1.put(2, b2);
		h1.put(3, b3);
		h1.put(4, b1);

		// output comes in ascending order of entry.
		for (Entry<Integer, CustomClassBook> string : h1.entrySet()) {
			Integer i1 = string.getKey();
			CustomClassBook cb1 = string.getValue();
			System.out.println(
					i1 + " " + cb1.author + " " + cb1.id + " " + cb1.name + " " + cb1.publisher + " " + cb1.quantity);
		}
	}

}
