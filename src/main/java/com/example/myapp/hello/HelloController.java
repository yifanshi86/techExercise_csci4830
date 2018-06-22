/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.myapp.hello;

import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


/**
 *
 * @author yifan
 */
@Controller
public class HelloController {
    
    @GetMapping("/hello")
    public String helloForm(){
        return "helloform";
    }
    
    @PostMapping("/hello")
    public String hello(HttpServletRequest request, Model model){
    
        String name = request.getParameter("name");
        
        if (name == null)
        {
            name = "world";
        }
        
        model.addAttribute("message", name);
        return "hello";
    }
}
