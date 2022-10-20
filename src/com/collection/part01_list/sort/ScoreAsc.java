package com.collection.part01_list.sort;

import java.util.Comparator;

public class ScoreAsc implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		//정수 오름차순
		int score1 = ((Score)o1).getScore();
		int score2 = ((Score)o2).getScore();
		
		if(score1 > score2) {
			return 1;
		}else if(score1 < score2) {
			return -1;
		}else {
			return 0;
		}
	}
}
