package org.lib.management.Controller;
import java.util.List;
import org.lib.management.Entity.LibAuthor;
import org.lib.management.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorController {
		@Autowired
		private AuthorService authservice;
		
		@GetMapping("/Author")
		public List<LibAuthor> findAll(@PathVariable LibAuthor author) {
			return authservice.getAllAuthor();
	}
		
		@GetMapping("/Author/{id}")
	    public String getBookById(@PathVariable int id) {
	        LibAuthor author = authservice.getAuthorById(id);
	        
	        if (author!= null) {
	            return "author Id found";
	        } else {
	            return "author Id is not found";
	        }
		}
	        
	        @PutMapping("/updateAuthor/{id}")
	         public String updateAuthor(@PathVariable int id, @RequestBody LibAuthor author) {
	            String updateAuthor = authservice.updateAuthor(id, author);{
	            if (updateAuthor != null) {
	                return "Author name has been updated";
	            } else {
	                return "Author name update failed";
	            }
	        }

		}
	        
	        @PostMapping("/addAuthor/author")
	        public String createAuthor(@RequestBody LibAuthor author) {
	            LibAuthor createdAuthor = authservice.createAuthor(author);
	            return "Author Name has been Saved";
	        }
	        @DeleteMapping("/deleteAuthor/author")
	       public String deleteAuthor(@PathVariable int id,@RequestBody LibAuthor author) {
				authservice.deleteAuthor(author);
				return "Author name has been Deleted";

			}
	

}

