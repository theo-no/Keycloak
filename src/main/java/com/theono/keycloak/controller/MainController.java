package com.theono.keycloak.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/main")
    @ResponseBody
    public String mainPage(HttpServletRequest request, HttpServletResponse response){
        System.out.println("here : "+request+ "// response : "+response);
        return "Main Page";
    }

}
