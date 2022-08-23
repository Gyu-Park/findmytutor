package com.project.findmytutor.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.findmytutor.domain.Member;

@Repository
public interface MemberRepository extends JpaRepository<Member, Long> {
    Optional<Member> findByEmail (String email);
    boolean existsByEmail (String email);
}
