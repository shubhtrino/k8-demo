package com.trino.k8demo.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class demoController {


    @GetMapping("/am-i-lucky")
    public String welcome(){
        Random random = new Random();

        return random.nextBoolean() ? " Its your lucky day!" : "Oh No ! try again";
    }
}
