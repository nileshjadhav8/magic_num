package com.nus.iss.workshop1241.workshop1241.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeConroller {
    private static final Logger logger = LoggerFactory.getLogger(HomeConroller.class);

    @GetMapping("/")
    public String getHome(){
        logger.info("home page loading........");
        return "index";
    }

}
