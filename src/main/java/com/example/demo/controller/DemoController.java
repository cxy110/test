package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {


    /**
     * @return helloword
     */
    @GetMapping(value = "/helloword")
    public String getInformation(){
        return "helloword";
    }

}
