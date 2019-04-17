package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AxeController {


    /**
     * @return helloword
     */
    @GetMapping(value = "/helloaxe")
    public String axeText(){
        return "hello Axe here";
    }

}
