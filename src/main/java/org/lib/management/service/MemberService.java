package org.lib.management.service;
import java.util.List;
import org.lib.management.Entity.LibMember;
import org.lib.management.Repo.MemberRepo;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private MemberRepo memberrepo;
    
    public List<LibMember> getAll() {
		return memberrepo.findAll();

	}
    public LibMember getMemberById(int id) {
		return memberrepo.findById(id).orElse(null);
	}
    public LibMember createMember(LibMember member) {
		return memberrepo.save(member);

	}
	
	public String updateMember(int id, LibMember member) {
		 memberrepo.save(member);
		 return"member has been Updated";

	}
    public String deleteMember(LibMember member) {
		memberrepo.delete(member);
		return "Member has been Deleted";

	}
    
}
