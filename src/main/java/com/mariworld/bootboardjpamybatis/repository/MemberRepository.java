package com.mariworld.bootboardjpamybatis.repository;

import com.mariworld.bootboardjpamybatis.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, String> {
}
