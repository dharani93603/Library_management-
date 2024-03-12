package org.lib.management.Repo;

import org.lib.management.Entity.LibMember;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepo extends JpaRepository<LibMember, Integer> {

}
