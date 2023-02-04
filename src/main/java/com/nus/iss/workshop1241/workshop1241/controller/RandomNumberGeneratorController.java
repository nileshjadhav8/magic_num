package com.nus.iss.workshop1241.workshop1241.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import com.nus.iss.workshop1241.workshop1241.model.Image;
import com.nus.iss.workshop1241.workshop1241.service.RandomNumberServiceimpl;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class RandomNumberGeneratorController {
    RandomNumberServiceimpl randomnumberservice;

    RandomNumberGeneratorController(RandomNumberServiceimpl randomNumberService) {
        this.randomnumberservice = randomNumberService;
    }

    @GetMapping("/get")
    public String getRandomNumber(Model model, HttpServletRequest httpRequest) {
       int number = Integer.valueOf(httpRequest.getParameter("number"));
       
       if(number <0 || number >30){
        throw new InValidNumberException("Invalid number: " +number);
         }

       List<Integer> randomNumbers =   randomnumberservice.generateRandomNumbers(number);

       List<Image> imageList = new ArrayList<Image>();
        for(int randomnumber : randomNumbers){
            imageList.add(new Image(Integer.toString(randomnumber), "/images/"+ Integer.toString(randomnumber) +".png"));
        }
        model.addAttribute(imageList);
         return "display";
    }

}
