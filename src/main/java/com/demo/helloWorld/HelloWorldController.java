package com.demo.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @GetMapping("/")
    String getHelloWorld(){
        return "Hello from v2 hehe!";
    }

    @GetMapping("/path")
    String getHelloWorld2(){
        return "Hello from path1!";
    }
}
