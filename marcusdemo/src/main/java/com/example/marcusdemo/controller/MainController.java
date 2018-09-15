package com.example.marcusdemo.controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1")
public class MainController {

        @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = "application/json")
        public String hello() {
            System.out.println("Hit me!");
            return "Hello, you!";
        }


}