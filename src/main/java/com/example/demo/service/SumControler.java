package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SumControler {

    @RequestMapping("/sum")
    public int sum(@RequestParam(value="a") int a, @RequestParam(value="b") int b) {
        return a + b;
    }

}
