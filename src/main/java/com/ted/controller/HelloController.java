package com.ted.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller("com.ted.controller.HelloController")
public class HelloController {

    @GetMapping("/hello")
    public String hello(Model model, @RequestParam("name") String name){
        model.addAttribute("name",name);
        return "hello";
    }
}
