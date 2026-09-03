package com.gustavo.curso.springboot.webapp.springboot_web.controllers;
import com.gustavo.curso.springboot.webapp.springboot_web.models.User;

// import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.List;



import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.gustavo.curso.springboot.webapp.springboot_web.models.dto.UserDTO;




@RestController //Significa que esta clase es un controlador REST y que los métodos devolverán datos en formato JSON
@RequestMapping("/api") //mapea la ruta /api a este controlador


public class UserRestController {

    //Metodos para manejar las solicitudes HTTP relacionadas con los usuarios
    @GetMapping("/details") //mapea la ruta details a este metodo

    public UserDTO details(){ // Mapea la respuesta a un objeto User para devolver datos en formato JSON
        User user = new User("Gustavo", "Gonzalez"); // Crea un objeto User con nombre y apellido
        UserDTO userDTO = new UserDTO(); // Crea un objeto UserDTO para encapsular el objeto User y el título
        userDTO.setUser(user); // Asigna el objeto User al UserDTO
        userDTO.setTitle("Hola Mundo");
        return userDTO;
    }


    @GetMapping("/list") //mapea la ruta list a este metodo
    public List<User> list(){
        
        User user = new User("Gustavo", "Gonzalez");
        User user2 = new User("Pablo", "Gonzalez");
        User user3 = new User("Carlos", "Gonzalez");

        List<User> users =  Arrays.asList(user, user2, user3); //se usa un helper para disminuir el codigo y crear la lista de usuarios de manera mas sencilla

      /*   List<User> users = new ArrayList<>(); // se crea una lista de usuarios vacia y se agregan los usuarios uno por uno
        users.add(user);
        users.add(user2);
        users.add(user3); */
        return users;
    }

    @GetMapping(path = "/details-map")
    public Map<String, Object> detailsMap() {
        User user = new User("Gustavo", "Gonzalez");
        Map<String, Object> model = new HashMap<>();

        model.put("title", "Hola Mundo");
        model.put("user", user);
        return model; // el primero parametro es el nombre de la variable y el segundo es el valor que se le asigna
    }
    

}
