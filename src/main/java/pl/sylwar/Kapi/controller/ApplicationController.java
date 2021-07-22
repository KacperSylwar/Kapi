package pl.sylwar.Kapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ApplicationController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }


    @PostMapping("/login_success_handler")
    public String loginSuccessHandler(){
        System.out.println("Login Success Handler....");
        return "index";
    }

}
