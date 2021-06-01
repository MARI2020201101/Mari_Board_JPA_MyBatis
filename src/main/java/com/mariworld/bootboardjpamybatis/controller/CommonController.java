package com.mariworld.bootboardjpamybatis.controller;

import com.mariworld.bootboardjpamybatis.dto.MemberDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
    public void customLogin(MemberDTO memberDTO){
        log.info("login......");
        log.info(memberDTO.toString());
    }
}
