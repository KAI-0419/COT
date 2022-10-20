package com.collection.part02_set.hashSet;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashset {
	public static void main(String[] args) {
		TestHashset th = new TestHashset();
		th.testHashSet();
	}
	
	public void testHashSet() {
		Set hset = new HashSet();
		
		hset.add("Java");
		hset.add(123);
		hset.add(45.67);
		hset.add(new Date());
		
		//저장 순서 유지 안됨
		System.out.println(hset);
		
		hset.add("Java");
		hset.add(123);
		
		//중복 허용 안함
		System.out.println(hset);
		
		System.out.println(hset.size());
		System.out.println(hset.contains(123));
		
		hset.clear();
		System.out.println(hset.size());
		
		hset.add(new Score("강현",23));
		hset.add(new Score("KAI",22));
		hset.add(new Score("Lina",21));
		
		System.out.println(hset);
		
		hset.add(new Score("Lina",21));
		hset.add(new Score("KAI",22));

		System.out.println(hset);
		
		//지정된 객체를 하나씩 꺼내는 기능 없다.
		//1. toArray()
		Object[] arr = hset.toArray();
		for(int i=0; i<arr.length; i++) {
			System.out.println(i+" : "+arr[i]);
		}
		
		//2. Iterator();
		Iterator iter = hset.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		
		
		
		
		
		
		
		
	}
}
