package com.example.friyay.controllers;

import com.example.friyay.services.DayOfWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IsItFriday {
    @ResponseBody
    @GetMapping("/isItFriday")
    public String dayOfTheWeek(){

        DayOfWeek dayOfTheWeek = new DayOfWeek();

        return dayOfTheWeek.getDayOfWeek();
    }
}
