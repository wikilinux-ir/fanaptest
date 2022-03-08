package q1.service;

import java.util.Collection;
import java.util.Map;

import q1.dao.Dao;
import q1.entity.Book;

public class BookService {

	private static Map<String,Book> bookstore = Dao.getStore(); 
	
	  public Collection<Book> findAllBooks() {   
	        return bookstore.values();
	    }
	    public Book findBookByIsbn(String isbn) {
	        return bookstore.get(isbn);
	    }
	    public void create(Book book) {
	        bookstore.put(book.getIsbn(), book);
	    }
	    public void delete(String isbn) {
	        bookstore.remove(isbn);
	    }
	    public void update() {
	    }
	}
