package org.lib.management.service;
import java.util.List;
import org.lib.management.Entity.LibTransaction;
import org.lib.management.Repo.TransactionRepo;
import org.springframework.stereotype.Service;

@Service
public class TransactionService {
	
	private TransactionRepo transrepo;
	
	
	public List<LibTransaction> findAllTransaction() {
		return transrepo.findAll();
		}
	
	public LibTransaction getTransactionById(int id) {
		return transrepo.findById(id).orElse(null);
}
	
	public LibTransaction createTransaction(LibTransaction trans) {
		return transrepo.save(trans);

	}
	
	public String updateTransaction(int id, LibTransaction trans) {
		 transrepo.save(trans);
		 return"Transaction has been Updated";

	}
    public String deleteTransaction(LibTransaction trans) {
		transrepo.delete(trans);
		return "Transaction has been Deleted";

	}

}
