package org.lib.management.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity

public class LibMember {
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	private int member_Id;
	@ManyToOne
	@JoinColumn(name = "Trancation_Id")
	private LibTransaction Trancation_Id;
	private String member_name;
	private String member_email;
	
	
	public int getMember_Id() {
		return member_Id;
	}
	public void setMember_Id(int member_Id) {
		this.member_Id = member_Id;
	}
	public LibTransaction getTrancation_Id() {
		return Trancation_Id;
	}
	public void setTrancation_Id(LibTransaction trancation_Id) {
		Trancation_Id = trancation_Id;
	}
	public String getMember_name() {
		return member_name;
	}
	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	
	
	
	
}