package org.lib.management.Controller;

import java.util.List;

import org.lib.management.Entity.LibTransaction;
import org.lib.management.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	@Autowired
	private TransactionService transervice;
	
	@GetMapping("/transaction")
	public List<LibTransaction> findAll(@PathVariable LibTransaction transaction) {
		return transervice.findAllTransaction();
}
	
	@GetMapping("/transaction/{id}")
    public String getTransactionById(@PathVariable int id) {
        LibTransaction transaction = transervice.getTransactionById(id);
        
        if (transaction!= null) {
            return "transaction Id found";
        } else {
            return "transaction Id is not found";
        }
	}
        
        @PutMapping("/updatetransaction/{id}")
         public String updateTransaction(@PathVariable int id, @RequestBody LibTransaction transaction) {
            String updateTransaction = transervice.updateTransaction(id, transaction);{
            if (updateTransaction != null) {
                return "Transaction Id has been updated";
            } else {
                return " Transaction Id update failed";
            }
        }

	}   
        @PostMapping("/addtransaction/Transaction")
    public String createTransaction(@RequestBody LibTransaction transaction) {
        LibTransaction createdTransaction = transervice.createTransaction(transaction);
        return "Transaction ID has been Saved";
    }
        
        
        
        @DeleteMapping("/deletetransaction/Transaction")
        public String deleteTransaction(@PathVariable int id,@RequestBody LibTransaction transaction) {
			transervice.deleteTransaction(transaction);
			return "Transaction Id has been Deleted";

		}


}


