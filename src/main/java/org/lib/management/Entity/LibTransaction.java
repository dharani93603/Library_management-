package org.lib.management.Entity;
import java.time.LocalDate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class LibTransaction {
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
    private int transaction_id;
	private String book;
	private boolean transaction_type;
	private LocalDate date;
	public int getTransaction_id() {
		return transaction_id;
	}
	public void setTransaction_id(int transaction_id) {
		this.transaction_id = transaction_id;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public boolean isTransaction_type() {
		return transaction_type;
	}
	public void setTransaction_type(boolean transaction_type) {
		this.transaction_type = transaction_type;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	
}
