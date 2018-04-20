package com.example.BirdApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by araam on 9/3/17.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "bird app, in the Home Controller!";
    }
}
