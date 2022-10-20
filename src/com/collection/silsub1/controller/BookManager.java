package com.collection.silsub1.controller;

import java.util.ArrayList;
import java.util.Scanner;

import com.collection.silsub1.model.dao.BookDao;
import com.collection.silsub1.model.vo.Book;

public class BookManager {
	private Scanner sc = new Scanner(System.in);
	private BookDao bd =new BookDao();
	
	public BookManager() {}
	
	//도서 추가
	public void addBook(Book book) {
		try {
		book.setbNo(bd.getLastBookNo()+1);
		}catch(IndexOutOfBoundsException e) {
			book.setbNo(1);
		}
		bd.addBook(book);
	}
	
	//도서 삭제
	public int deleteBook(int no) {
		return bd.deleteBook(no);
	}
	
	//도서 검색
	public int searchBook(String title) {
		return bd.searchBook(title);
	}
	
	public Book selectBook(int index) {
		return bd.selectBook(index);
	}
	
	public ArrayList<Book> selectAll(){
		return bd.selectAll();
	}
	public Book[] sortedBookList() {
		ArrayList<Book> list = bd.sortedBookList();
		Book[] bk = new Book[list.size()];
		for(int i=0; i<bk.length; i++) {
			bk[i] = list.get(i);
		}
		return bk;
	}
	
	public void printBookList(Book[] br) {
		for(Book tmp : br) {
			System.out.println(tmp);
		}
	}
}