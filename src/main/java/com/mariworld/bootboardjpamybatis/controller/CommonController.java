package com.mariworld.bootboardjpamybatis.controller;

import com.mariworld.bootboardjpamybatis.security.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class CommonController {

    @GetMapping("/customLogin")
    public void customLoginForm(){
    }

    @PostMapping("/customLogin")
    public void customLogin(@AuthenticationPrincipal MemberDTO memberDTO){
        log.info("login......");
        log.info(memberDTO.toString());
    }
}
