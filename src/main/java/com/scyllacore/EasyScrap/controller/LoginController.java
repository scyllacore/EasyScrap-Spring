package com.scyllacore.EasyScrap.controller;

import com.scyllacore.EasyScrap.db.dto.SignUpDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {

    @GetMapping("login")
    public String renderLoginPage(){
        return "/login/login";
    }

    @PostMapping("/ajax/signUp")
    @ResponseBody
    public String signUp(SignUpDTO signUp){
        System.out.println(signUp);
        return "signUpcontroller";
    }
}
