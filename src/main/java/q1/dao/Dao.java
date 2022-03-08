package q1.dao;

import java.util.HashMap;
import java.util.Map;

import q1.entity.Book;

public class Dao {
	private static Map<String, Book> bookstore = null;

	public static Map<String, Book> getStore(){
		
		if (bookstore == null) {
			
			bookstore = new HashMap<String, Book>();
			return bookstore;
		}
		
		return bookstore;
		
	}
	
	
	
	
}
