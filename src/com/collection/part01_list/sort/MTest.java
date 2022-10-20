package com.collection.part01_list.sort;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class MTest {

	public static void main(String[] args) {
		
		List list = new ArrayList();
		
		list.add(new Score("강현", 22));
		list.add(new Score("Kai", 21));
		list.add(new Score("Alina", 20));
		
		list.add(new Score("Mark", 19));
		list.add(new Score("Blake", 18));
		list.add(new Score("Sandra", 17));

		System.out.println(list);

		// 정렬
		//1. Comparable - 기본 정렬 기준
		
		Collections.sort(list);
		System.out.println("list sort: " + list);
		
		//2. Comparator - 기본 정렬기준 이외에 다른 정렬 기준
		
		Collections.sort(list, new ScoreAsc());
		System.out.println("list sort: " + list);
		
		
		
		
		
		
		
		
		
	}

}
