package com.example.demo1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("th")
public class ThymeleafController {

	@RequestMapping("/index")
    public String index() {
        return "thymeleaf/index";
}
}