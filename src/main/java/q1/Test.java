package q1;

import q1.entity.Book;
import q1.service.BookService;

public class Test {

	public static void main(String[] args) {
		
		BookService service = new BookService();
		
		Book book1 = new Book("122545", "Advanced java", "mrh");
		
		service.create(book1);
		Book book2 = service.findBookByIsbn("122545");
		System.out.println(book2.getIsbn());
		service.delete("12121");

		for(Book book:service.findAllBooks()) {
			
			System.out.println(book.getAuthor());
		}
	}
}
