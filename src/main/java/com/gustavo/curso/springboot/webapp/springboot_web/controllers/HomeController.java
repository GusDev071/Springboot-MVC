package com.gustavo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;



@Controller 
public class HomeController {


    @GetMapping({"", "/home", "/"}) //mapea la ruta / y /home a este metodo
    public String home() {

        return "redirect:/details"; // redirige a la ruta /list
        //return "forward:/details"; redirige a la ruta /details
    }
    
}
