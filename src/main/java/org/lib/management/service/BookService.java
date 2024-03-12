
package org.lib.management.service;
import java.util.List;
import org.lib.management.Entity.LibBook;
import org.lib.management.Repo.BookRepo;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	     
	private BookRepo bookrep;
	
	public List<LibBook> findAllBooks() {
		return bookrep.findAll();
		}
	
	public LibBook getBookById(int id) {
		return bookrep.findById(id).orElse(null);
}
	
	public LibBook createBook(LibBook book) {
		return bookrep.save(book);

	}
	
	public String updateBook(int id, LibBook book) {
		 bookrep.save(book);
		 return "Book has been Updated";
		 }
    public String deleteBook(LibBook book) {
		bookrep.delete(book);
		return "Book has been Deleted";

	}
}
