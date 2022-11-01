package com.springboot.alldemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vi/get-api")
public class GetController {

    //http://localhost:8080/api/vi/get-api/hello
    @RequestMapping(value="/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World";
    }

    //http://localhost:8080/api/vi/get-api/name
    @GetMapping(value = "/name")
    public String getName() {
        return "Flature";
    }
}
