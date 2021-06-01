package com.mariworld.bootboardjpamybatis.repository;

import com.mariworld.bootboardjpamybatis.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.stream.IntStream;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insertTest(){
        IntStream.rangeClosed(1,100).forEach(
                i->{
                    Member member = Member.builder()
                            .email("user"+i+"@mail.com")
                            .password("1111")
                            .name("user"+i)
                            .build();
                    memberRepository.save(member);
                }
        );

    }
}
