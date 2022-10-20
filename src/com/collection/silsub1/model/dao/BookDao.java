package com.collection.silsub1.model.dao;

import java.util.ArrayList;
import com.collection.silsub1.model.comparator.AscCategory;
import com.collection.silsub1.model.vo.Book;

public class BookDao {
	public ArrayList<Book> bookList;
	
	public BookDao() {
	bookList = new ArrayList<Book>();
	}
	
	public BookDao(ArrayList<Book> bookList) {
		super();
		this.bookList = bookList;
	}
	
	public int getLastBookNo() {
		int no = bookList.get(bookList.size()-1).getbNo();
		return no;
	}

	public void addBook(Book book) {
		bookList.add(book);
	}
	
	public int deleteBook(int no) {
		int res = 0;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getbNo() == no) {
				bookList.remove(i);
				res = 0;
				break;
			}
		}
		return res;
	}
	
	public int searchBook(String title) {
		int index = -1;
		for(int i=0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(title));{
				index = i;
				break;
			}
		}
		return index;
	}
	
	public Book selectBook(int index) {
		return bookList.get(index);
	}

	public ArrayList<Book> selectAll() {
		return bookList;
	}

	public ArrayList<Book> sortedBookList() {
		bookList.sort(new AscCategory());
		return bookList;
	}
}