package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class SimpleController {

    @RequestMapping("/")
    public String index(){

        return "Hello Ayub! Congratulations you have connected your GitHub account with VSCode Via Git";
    }

    @RequestMapping("/hello")
    public String printFullName(){
        return "Ayub Kibirio!";
    }

    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String doLogin(@RequestParam String username, @RequestParam String password){
        
        return username + " " + password;
    }


    
    
}
