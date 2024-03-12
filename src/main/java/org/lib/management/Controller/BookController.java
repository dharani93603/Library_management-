package org.lib.management.Controller;
import java.awt.print.Book;
import java.util.List;
import org.lib.management.Entity.LibBook;
import org.lib.management.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	
	@Autowired
	private BookService bookservice;
	
	@GetMapping("/books")
	public List<LibBook> findAll(@PathVariable Book book) {
		return bookservice.findAllBooks();
}
	
	@GetMapping("/books/{id}")
    public String getBookById(@PathVariable int id) {
        LibBook book = bookservice.getBookById(id);
        
        if (book!= null) {
            return "Book Id found";
        } else {
            return "Book Id is not found";
        }
	}
	
	@PostMapping("/add")
    public String createBook(@RequestBody LibBook book) {
        LibBook createdBook = bookservice.createBook(book);
        return "Book has been added";
    }
        
        @PutMapping("/updatebooks/{id}")
         public String updateBook(@PathVariable int id, @RequestBody LibBook book) {
            String updatedBook = bookservice.updateBook(id, book);{
            if (updatedBook != null) {
                return "Book has been updated";
            } else {
                return "Book update failed";
            }
        }

	}
        @DeleteMapping("/deletebooks/{id}")
         public String deleteBook(@PathVariable int id,@RequestBody LibBook book) {
			bookservice.deleteBook(book);
			return "Book has been Deleted";

		}
}
