package com.example.friyay.controllers;

import com.example.friyay.services.DayOfWeek;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IsItFriday {

    @ResponseBody
    @GetMapping("/")
    public String hello() {
        return "<title>IS IT FRIDAY?</title>\n" +
                "<h1>Welcome</h1>\n" +
                "<br>\n" +
                "<p>Is it friday shows you whether it's friday or not</p>\n" +
                "<p>To see whether it's friday or not, go to the URL: localhost:8080/isItFriday</p>\n" +
                "<p><iframe style=\"width: 1025px; height: 400px; overflow: hidden;\" src=\"https://st2.depositphotos.com/3969727/8963/v/950/depositphotos_89639972-stock-illustration-friday-happy-end-of-the.jpg\" width=\"300\" height=\"300\"></iframe></p>";
    }

    @ResponseBody
    @GetMapping("/isItFriday")
    public String dayOfTheWeek(){

        DayOfWeek dayOfTheWeek = new DayOfWeek();

        return dayOfTheWeek.getDayOfWeek();
    }
}
