package com.nus.iss.workshop1241.workshop1241.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.service.annotation.GetExchange;

@Controller
public class HomeConroller {
    @GetMapping("/")
    public String getHome(){
        return "index";
    }

}
