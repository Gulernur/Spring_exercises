package com.example.helloworldspring.controllers;

import com.example.helloworldspring.services.DayOfWeek;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

    //exercise 1.1:
    @GetMapping
    public String hello(){
        return "Hello bitch";
    }

    //Exercise 1.2:
    @GetMapping("/echo")
    public String endPoint(@RequestParam String input){
        return input;
    }

    //Exercise 1.3:
    @GetMapping("/isItFriday")
    public String isItFriday(){
        DayOfWeek dayOfWeek = new DayOfWeek();
        return dayOfWeek.friday() + "";
    }
}
