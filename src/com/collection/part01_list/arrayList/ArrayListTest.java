package com.collection.part01_list.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class ArrayListTest {
	public void testArrayList() {
		ArrayList alist = new ArrayList();
		
		alist.add("apple");
		alist.add(123); 		//autoBoxing
		alist.add(45.67);		//autoBoxing(값->객체)
		alist.add(new Date());
		
		System.out.println("alist: " + alist);
		
		//인덱스로 접근
		for(int i=0; i<alist.size(); i++) {
			System.out.println(i + " : " + alist.get(i));
		}
		
		//중복 저장 허용
		alist.add("apple");
		System.out.println("alist: " + alist);
		
		//원하는 인덱스에 객체 추가
		alist.add(1,"banana");
		System.out.println("alist: " + alist);
		
		//저장된 객체 삭제
		alist.remove(2);
		System.out.println("alist: " + alist);

		//해당 인덱스에 객체를 수정
		alist.set(1, 123);
		System.out.println("alist: " + alist);
		
		//사용자 정의 클래스 객체 추가 Score
		alist.add(new Score());
		System.out.println(alist);
	}
	
	public void testArrayListSort() {
		ArrayList list = new ArrayList();
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("Banana");
		list.add("Grape");
		
		System.out.println("list: " + list);
		
		Collections.sort(list);
		System.out.println("listSort: " + list);
	}

}
