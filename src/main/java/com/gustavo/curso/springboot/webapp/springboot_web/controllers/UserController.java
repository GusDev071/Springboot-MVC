package com.gustavo.curso.springboot.webapp.springboot_web.controllers;
import com.gustavo.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //Metodos para manejar las solicitudes HTTP relacionadas con los usuarios
    @GetMapping("/details") //mapea la ruta details a este metodo

    public String details(Model model ){ //moidel es para pasar datos a la vista este es como un map

        User user = new User("Gustavo", "Gonzalez"); // Crea un objeto User con nombre y apellido
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("user", user); // el primero parametro es el nombre de la variable y el segundo es el valor que se le asigna
        return "details";
    }

}
