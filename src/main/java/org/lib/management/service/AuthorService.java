package org.lib.management.service;

import java.util.List;

import org.lib.management.Entity.LibAuthor;
import org.lib.management.Repo.AuthorRepo;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	  
	private AuthorRepo authorrepo;
	
   public List<LibAuthor> getAllAuthor() {
	return authorrepo.findAll();
}
   public LibAuthor getAuthorById(int id) {
	return authorrepo.findById(id).orElse(null);

}
   public LibAuthor createAuthor(LibAuthor author) {
	return authorrepo.save(author);
}
   public String updateAuthor(int id, LibAuthor author) {
	 authorrepo.save(author);
	 return "Author has been updated";
}
   public String deleteAuthor(LibAuthor author) {
	authorrepo.delete(author);
	return "Author has been deleted";
}
}
