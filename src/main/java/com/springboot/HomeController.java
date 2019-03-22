package com.springboot;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  

@RestController  
public class HomeController {  
    @RequestMapping("/welcome")  
    public String welcome(){  
        return "Welcome to spring boot training!";  
    } 
}  