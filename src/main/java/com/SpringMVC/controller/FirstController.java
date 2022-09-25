package com.SpringMVC.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
    @RequestMapping(value="/firstController")
    public String xxx(){
        System.out.println("访问");
        return "index";
    }
}
