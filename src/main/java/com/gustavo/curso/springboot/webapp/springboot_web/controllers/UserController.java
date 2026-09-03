package com.gustavo.curso.springboot.webapp.springboot_web.controllers;
import com.gustavo.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import java.util.List;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class UserController {

    //Metodos para manejar las solicitudes HTTP relacionadas con los usuarios
    @GetMapping("/details") //mapea la ruta details a este metodo

    public String details(Model model ){ //moidel es para pasar datos a la vista este es como un map

        User user = new User("Gustavo", "Gonzalez"); // Crea un objeto User con nombre y apellido
        user.setEmail("prueba@gmail.com"); // se agrega el email al usuario
        model.addAttribute("title", "Hola Mundo");
        model.addAttribute("user", user); // el primero parametro es el nombre de la variable y el segundo es el valor que se le asigna
        return "details";
    }

    @GetMapping("/list")
    public String list(ModelMap model){ 
        List<User> users =  Arrays.asList(
        new User("John", "Doe", "john.doe@gmail.com"), 
        new User("Jane", "Smith", "jane.smith@gmail.com"), 
        new User("Bob", "Johnson", "bob.johnson@gmail.com"), 
        new User("Alice", "Brown")); //se usa un

        model.addAttribute("users", users);
        model.addAttribute("title", "Listado de usuarios");
        return "list";
    }

}
