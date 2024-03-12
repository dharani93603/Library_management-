package org.lib.management.Repo;

import org.lib.management.Entity.LibAuthor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepo extends JpaRepository<LibAuthor, Integer> {

}
