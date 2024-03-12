package org.lib.management.Repo;

import org.lib.management.Entity.LibTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepo extends JpaRepository<LibTransaction, Integer>{

}
