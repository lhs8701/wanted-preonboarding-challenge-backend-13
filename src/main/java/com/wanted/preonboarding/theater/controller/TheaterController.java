package com.wanted.preonboarding.theater.controller;

import com.wanted.preonboarding.theater.service.TheaterService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/theater")
@RequiredArgsConstructor
public class TheaterController {
    public static final String WELCOME_MESSAGE = "Welcome to The Wanted Theater";
    private final TheaterService theaterService;

    @GetMapping("hello")
    public String welcomeMessage(){
        return WELCOME_MESSAGE;
    }

    @GetMapping("enter")
    public String enter(@RequestParam long amount, @RequestParam boolean doesHaveInvitation){
        return theaterService.enter(amount, doesHaveInvitation);
    }
}
