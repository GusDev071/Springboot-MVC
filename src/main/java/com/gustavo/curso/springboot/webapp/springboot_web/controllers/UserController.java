package com.gustavo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //Metodos para manejar las solicitudes HTTP relacionadas con los usuarios
    @GetMapping("/details") //mapea la ruta details a este metodo

    public String details(Model model ){ //moidel es para pasar datos a la vista este es como un map
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("name", "Gustavo"); // el primero parametro es el nombre de la variable y el segundo es el valor que se le asigna
        model.addAttribute("lastName", "Gonzalez");
        return "details";
    }

}
