package com.collection.silsub1.model.comparator;

import java.util.Comparator;

public class DescCategory implements Comparator{
	@Override
	public int compare(Object o1, Object o2) {
		int num1 = (Integer)o1;
		int num2 = (Integer)o2;
		
		if (num1 > num2) {
			return 1;
		} else {
			return -1;
		}
	}
}