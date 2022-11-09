package it.develhope.Deploy1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class BasicController {


    @Value("${devName}")
    String name;
    @GetMapping
    public String getName(){
        return name;
    }

}
