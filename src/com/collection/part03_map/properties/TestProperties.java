package com.collection.part03_map.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) {
		TestProperties tp = new TestProperties();
		tp.test();
		tp.test2();
	}
	
	public void test() {
		Properties prop = new Properties();
		
		prop.setProperty("name", "강현");
		prop.setProperty("age", "23");
		prop.setProperty("id", "User-01");
		prop.setProperty("pw", "Pass-01");
		
		System.out.println(prop);
		
		try {
			prop.store(new FileOutputStream("user.properties"), "user info");
			prop.store(new FileWriter("user.txt"), "user info");
			prop.storeToXML(new FileOutputStream("user.xml"), "user info");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void test2() {
		Properties prop = new Properties();
		
		try {
			prop.load(new FileInputStream("user.properties"));
			
			System.out.println(prop.getProperty("id"));
			System.out.println(prop.getProperty("pw"));
			System.out.println(prop.getProperty("name"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
	
	
	
	
	
	
	
	
}
