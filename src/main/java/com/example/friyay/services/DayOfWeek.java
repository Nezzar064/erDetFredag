package com.example.friyay.services;

import java.time.Clock;
import java.time.LocalDate;

public class DayOfWeek {

    public String getDayOfWeek(){
        java.time.DayOfWeek dayOfWeek = getDayOfTheWeek();

        //For testing
        java.time.DayOfWeek dayOfWeekFridayTest = java.time.DayOfWeek.FRIDAY;

        String topHeader = "<center><h1>Is it Friday?</h1></center><br>";

        if (dayOfWeek == java.time.DayOfWeek.FRIDAY) {
            return topHeader + friday();
        }
        return topHeader + "<center><h1>No, it is " + dayOfWeek + "</h1></center>";
    }

    private java.time.DayOfWeek getDayOfTheWeek() {
        Clock clock = Clock.systemUTC();
        LocalDate localDate = LocalDate.now(clock);
        return java.time.DayOfWeek.from(localDate);
    }

    private String friday(){
        return "<center><h1 style=\"background-color:FF99CC; \"> It's Friday!!!!!</h1></center> " +
                "<center><iframe width=\"560\" height=\"315\" src=\"https://www.youtube.com/embed/j9V78UbdzWI?start=25\" frameborder=\"0\" allow=\"accelerometer; autoplay=1; clipboard-write; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe></center>";

    }
}
