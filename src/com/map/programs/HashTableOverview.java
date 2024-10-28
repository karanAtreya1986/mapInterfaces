package com.map.programs;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;

public class HashTableOverview {

//Legacy.
//	Synchronised.
//	Heavy loaded.
//	Use in multi-threaded environment.
//	Hash table is also known as an array of list. Each list is known as bucket.
//	Position of bucket is identified by method known as hashcode().
//	Hash table has key-value pairs. Unique elements only.
//	May or may not have null key or null value.

//	Hash map vs hash table-
//	Hash map is not synchronized. Hash table is synchronized.
//	Hash map allows any number of  null key and multiple null values. Hash table does not allow any null key or null value.
	// hash table cannot have null keys and null values, not even one, else we get
	// null pointer exception.
//	Hash map is fast. Hash table is slow since heavy loaded and synchronized. Hash table cannot be unsynchronized because its synchronized internally.
//	To make hash map synchronised use this method:collections.synchronisedmap(hashmapname)
//	Enumeration for traversal in hash table. For hash map we use iterator, for each loop.
//returns output in any order.
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

		for (Entry<Integer, String> string : m1.entrySet()) {
			Integer i1 = string.getKey();
			String s1 = string.getValue();
			System.out.println(i1 + " " + s1);

		}
	}
}
