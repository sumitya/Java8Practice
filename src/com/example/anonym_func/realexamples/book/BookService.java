package com.example.anonym_func.realexamples.book;

import java.util.Collections;
import java.util.List;

public class BookService {

	/*
	 * ( o1, o2) -> o2.getName().compareTo(o1.getName());
	 * 
	 */
	public List<Book> getBooksinSort() {
		List<Book> books = new BookDAO().getBooks();
		Collections.sort(books, (Book o1, Book o2) ->
		{return o2.getName().compareTo(o1.getName()); }
		);
		return books;
	}

	public static void main(String[] args) {

		System.out.println(new BookService().getBooksinSort());
	}
}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) { return
 * o2.getName().compareTo(o1.getName()); }
 */
