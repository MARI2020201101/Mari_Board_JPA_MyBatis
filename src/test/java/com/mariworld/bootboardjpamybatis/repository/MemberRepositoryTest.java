package com.mariworld.bootboardjpamybatis.repository;

import com.mariworld.bootboardjpamybatis.entity.Member;
import com.mariworld.bootboardjpamybatis.entity.MemberRole;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private PasswordEncoder passwordEncoder;
    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertTest(){
        IntStream.rangeClosed(1,100).forEach(
                i->{
                    Member member = Member.builder()
                            .email("user"+i+"@mail.com")
                            .password("1111")
                            .name("사용자"+i)
                            .build();
                    memberRepository.save(member);
                }
        );

    }

    @Test
    public void insertSecurityTest(){
        IntStream.rangeClosed(1,100).forEach(
                i->{
                    Member member = Member.builder()
                            .email("user"+i+"@mail.com")
                            .password(passwordEncoder.encode("1111"))
                            .name("사용자"+i)
                            .build();
                    if(i>90){
                        member.changeMemberRole(MemberRole.ADMIN);
                    }else{
                        member.changeMemberRole(MemberRole.USER);
                    }
                    memberRepository.save(member);
                }
        );

    }
}
