package com.mariworld.bootboardjpamybatis.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MemberUserDetailsServiceTest {
    @Autowired
    private MemberUserDetailsService service;

    @Test
    public void loadUserTest(){
        MemberDTO memberDTO = (MemberDTO) service.loadUserByUsername("user100@mail.com");

    }

}
