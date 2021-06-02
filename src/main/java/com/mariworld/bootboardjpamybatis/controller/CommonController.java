package com.mariworld.bootboardjpamybatis.controller;

import com.mariworld.bootboardjpamybatis.security.MemberDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@Slf4j
public class CommonController {

    @GetMapping("")
    public String index(){
        return "redirect:/board/list";
    }

    @GetMapping("/customLogin")
    public void customLoginForm(String error, String logout, Model model
        , @AuthenticationPrincipal MemberDTO memberDTO
        , HttpServletResponse response) throws IOException {
        if(error!=null){
            model.addAttribute("msg","패스워드와 아이디를 확인해 주십시오");
        }
        if(logout!=null){
            model.addAttribute("msg","로그아웃 되었습니다.");
        }
        if(memberDTO!=null){
            response.sendRedirect("/customLogout");
        }
    }
    @GetMapping("/accessError")
    public void accessError(){
    }

    @GetMapping("/customLogout")
    public void customLogoutForm(){
    }

}
