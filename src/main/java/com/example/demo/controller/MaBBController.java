package main.java.com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaBBController {
    @GetMapping(value="myGod")
    public String showTest(){
        return "儿子,我是你爸爸！";
    }
}
