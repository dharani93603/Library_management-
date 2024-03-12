package org.lib.management.Controller;

import java.util.List;

import org.lib.management.Entity.LibMember;
import org.lib.management.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
	@Autowired
	private MemberService memservice;
	
	@GetMapping("/Member")
	public List<LibMember> findAll(@PathVariable LibMember member) {
		return memservice.getAll();
}
	
	@GetMapping("/Member/{id}")
    public String getBookById(@PathVariable int id) {
        LibMember member = memservice.getMemberById(id);
        
        if (member!= null) {
            return "member Id found";
        } else {
            return "member Id is not found";
        }
	}
        
        @PutMapping("/updateMember/{id}")
         public String updateMember(@PathVariable int id, @RequestBody LibMember member) {
            String updateAuthor = memservice.updateMember(id, member);{
            if (updateAuthor != null) {
                return "Member Id has been updated";
            } else {
                return "Member Id update failed";
            }
        }

	}   
        @PostMapping("/addMember/member")
    public String createMember(@RequestBody LibMember member) {
        LibMember createdMember = memservice.createMember(member);
        return "Member Name has been Saved";
    }
        
        
        
        @DeleteMapping("/deleteMember/member")
        public String deleteMember(@PathVariable int id,@RequestBody LibMember member) {
			memservice.deleteMember(member);
			return "Member name has been Deleted";

		}


}


