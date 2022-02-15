package com.example.helloworldspring.services;

import java.time.LocalDate;

public class DayOfWeek {

    public String friday(){
       LocalDate today = LocalDate.now();
        System.out.println(today.getDayOfWeek().toString());
        if(today.getDayOfWeek().toString().equals("FRIDAY")){
            return "The day is: Friday";
        }else{
            return today.getDayOfWeek().toString();
        }
    }
}
