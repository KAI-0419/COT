package com.collection.part01_list.sort; //dto,vo class

import java.util.Objects;

public class Score implements Comparable {
	private String name;
	private int score;
	
	public Score() {}
	public Score(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", score=" + score + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(name, score);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Score other = (Score) obj;
		return Objects.equals(name, other.name) && score == other.score;
	}
	
	@Override
	public int compareTo(Object o) {
		// name 오름차순으로 정렬
		String otherName = ((Score)o).getName();
		return -name.compareTo(otherName);
			   // 음수 0 양수
		// "가".compareTo("나"); -> 음수
		// "나".compareTo("가"); -> 양수
		
		// 바꿔줘야 할 경우 양수 리턴, 바꾸지 않을 경우 음수 리턴
		
	}
	
	
	
	
	
	
	
	
}
