package com.map.programs;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapWithCustomClassComparator {

	public static void main(String[] args) {

		TreeMap<Integer, BookCustomClassWithComparableInterface> h1 = new TreeMap<>();

		BookCustomClassWithComparableInterface b1 = new BookCustomClassWithComparableInterface(0, null, null, "tiger",
				5000);
		BookCustomClassWithComparableInterface b2 = new BookCustomClassWithComparableInterface(0, null, null, "tiger",
				5000);
		BookCustomClassWithComparableInterface b3 = new BookCustomClassWithComparableInterface(1, "hello", "nelson",
				"tiger", 55000);
		BookCustomClassWithComparableInterface b4 = new BookCustomClassWithComparableInterface(2, "jinder", "mandela",
				"lion", 15000);

		// change the order of keys here.
		// then only we can know the sorting working, else we get the same as entered.
		// It sorts based on key.
		// So, key 1 corresponds to b3 object, then key 2 which corresponds to b1
		// object, then key 3
		// which corresponds to b2 object and key 4 which corresponds to b4 object.

		h1.put(4, b4);
		h1.put(3, b2);
		h1.put(1, b3);
		h1.put(2, b1);

		// output comes in ascending order of keys.
		for (Entry<Integer, BookCustomClassWithComparableInterface> string : h1.entrySet()) {
			Integer i1 = string.getKey();
			BookCustomClassWithComparableInterface cb1 = string.getValue();
			System.out.println(
					i1 + " " + cb1.author + " " + cb1.id + " " + cb1.name + " " + cb1.publisher + " " + cb1.quantity);
		}
	}

}
