package org.lib.management.Repo;

import org.lib.management.Entity.LibBook;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<LibBook,Integer> {

}
