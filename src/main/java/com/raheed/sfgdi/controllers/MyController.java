package com.raheed.sfgdi.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String sayHello() {
        System.out.println("Hello Rochelle");
        return "Hi RRM";
    }
}
