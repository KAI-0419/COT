package com.collection.part04_generics.generics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestGenerics {
	public static void main(String[] args) {
		TestGenerics tg = new TestGenerics();
//		tg.test1();
		tg.test2();
	}
	
	public void test1() {
		List list = new ArrayList();
		
		list.add(new String("String"));
		list.add(new Book());
		list.add(new Student());
		list.add(new Car());
		
		for(int i=0; i<list.size(); i++) {
			Object obj = list.get(i);
			
			if(obj instanceof Book) {
				Book b = (Book)obj;
				b.printBook();
			}
		}
	}
	
	public void test2() {
		List<Book> list = new ArrayList<Book>();
		List list2 = new ArrayList();
		
		list.add(new Book());
		list.add(new Book());
//		list.add(new Car()); //에러 발생

		list2.add(new Book());
		list2.add(new Book());
		list2.add(new Car());

		for(Object ob : list2) {
			if(ob instanceof Book) {
				((Book)ob).printBook();
			}else if(ob instanceof Car) {
				((Car)ob).printCar();
			}
		}
		
		//generics O
		for(Book b : list) {
			b.printBook();
		}
	}

	public void test3() {
		Map<String, Book> map = new HashMap<String, Book>();
		map.put("one", new Book("Java"));
		map.put("two", new Book("Oracle"));
		
		Book b = new Book("Sun");
		map.put("three", b);
		
	//	map.put("four", "soft");
		
		Set<Map.Entry<String, Book>> entry = map.entrySet();
		
		Iterator<Map.Entry<String, Book>> iter = entry.iterator();
	}

class Book{
	private String title;
	public Book() {}
	public Book(String title) {
		this.title = title;
	}
	public void printBook() {
		System.out.println("printBook() call..");
	}
	@Override
	public String toString() {
		return "Book";
	}
}

class Student{
	public Student() {}
	public void score() {
		System.out.println("score() call..");
	}
	@Override
	public String toString() {
		return "Student";
	}
}

class Car{
	public Car() {}
	public void printCar() {
		System.out.println("printCar() call..");
	}
	@Override
	public String toString() {
		return "Car";
	}
}

}














