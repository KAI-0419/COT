package com.collection.part03_map.hashMap;

import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	public static void main(String[] args) {
		TestHashMap tm = new TestHashMap();
//		tm.testHashmap();
		tm.testHashmap2();
	}

	public void testHashmap() {
		
		Map map = new HashMap();
		
		//key, value
		map.put("one",new Date());
		map.put(12, "red apple");
		map.put(33, 123);
		
		System.out.println(map);
		
		//key는 중복 저장 되지 않는다
		map.put(12, "Yellow banana");
		System.out.println(map);
		
		//value는 중복 저장 된다
		map.put(11, "Yellow banana");
		map.put(9, "Yellow banana");
		System.out.println(map);
		
		//key값을 이용해 value값을 가지고 올때
		System.out.println(map.get(9));
		
		//key값을 통해 삭제
		map.remove(9);
		System.out.println(map);
		
		//저장된 객체 수
		System.out.println(map.size());
	}
		public void testHashmap2() {
			//Map에 저장된 객체 연속적으로 처리
			Map map = new HashMap();
			
			map.put("one", "Java 11");
			map.put("two", "Mysql");
			map.put("three", "jdbc");
			map.put("four", "html");
			map.put("five", "css");
			
			//1. keySet();을 이용해 key값만 set으로 만들고,
			//	 Iterator();를 사용해 set에 담겨있는 key값들을 한줄로 줄 세운다
			Set keys = map.keySet();
			Iterator keyIt = keys.iterator();
			
			while(keyIt.hasNext()) {
				String key = (String)keyIt.next();
				String value = (String)map.get(key);
				System.out.println(key + "=" + value);
			}
			
		//2. value들만 values()사용하여 Collection으로 만듦
		Collection values = map.values();
		
		//2-1. Iterator();
		Iterator valueIt = values.iterator();
		while(valueIt.hasNext()) {
			System.out.println(valueIt.next());
		}
		
		//2-2 toArray();
		Object[] valArr = values.toArray();
		for(int i=0; i<valArr.length; i++) {
			System.out.println(i+" : "+valArr[i]);
		}
		
		//3. Entry : entrySet();
		Set set = map.entrySet();
		Iterator entryIter = set.iterator();
		
		while(entryIter.hasNext()) {
			Map.Entry entry = (Map.Entry)entryIter.next();
			System.out.println(entry.getKey()+"="+entry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
