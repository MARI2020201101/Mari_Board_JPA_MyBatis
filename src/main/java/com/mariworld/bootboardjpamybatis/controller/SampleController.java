package com.mariworld.bootboardjpamybatis.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class SampleController {

    @GetMapping("/sample")
    public String sample(){
        log.info("sample.....");
        return "/blank";
    }
}
