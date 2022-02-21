package com.example.thedailypaperszzz.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontPageController {

    @GetMapping("/")
    public String index(){
        return "index";
    }
    @GetMapping("/article-one")
    public String articleOne(){
        return "article-one";
    }

}
