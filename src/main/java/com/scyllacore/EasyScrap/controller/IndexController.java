package com.scyllacore.EasyScrap.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/index")
    public String renderIndexPage(){
        return "/main/index";
    }
}
