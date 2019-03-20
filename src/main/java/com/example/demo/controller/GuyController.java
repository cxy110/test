package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class GuyController {
    @GetMapping(value="guyTest")
    public String guyTest(){
        Date date=new Date();
        return "这是一个简单的测试"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
    }
}
