package com.gustavo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gustavo.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.gustavo.curso.springboot.webapp.springboot_web.models.User;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import org.springframework.core.env.Environment; 
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;






@RestController 
@RequestMapping ("/api/var")
public class PathVariableController {


    @Value ("${config.username}")
    private String username;

    @Value ("${config.listOfValues}")
    private List<String> listOfValues;

    @Value ("${config.code}")
    private Integer code;

    @Value ("#{'${config.listOfValues}'.split(',')}") //Separa la cadena de valores en una lista de strings usando la coma como separador
    private List<String> valueList;

     @Value ("#{'${config.listOfValues}'}") //Obtiene la cadena de valores completa como un solo string
    private String valueString;

    @Value ("#{${config.valuesMap}}") //Obtiene el mapa de valores definido en el archivo de propiedades
    private Map<String, Object> valuesMap;

    @Value ("#{${config.valuesMap}.product}") //Obtiene el valor de la clave 'product' del mapa de valores
    private String product;

    @Value ("#{${config.valuesMap}.description}") //Obtiene el valor de la clave 'description' del mapa de valores
    private String description;

    @Value ("#{${config.valuesMap}.price}") //Obtiene el valor de la clave 'price' del mapa de valores
    private Long price;

    @Autowired 
    private Environment environment; //Inyecta el objeto Environment para acceder a las propiedades del entorno

    @GetMapping("/baz/{message}") //mapea la ruta baz/{message} a este metodo, donde {message} es un valor que se pasara como parametro en la URL
    public ParamDto baz(@PathVariable String message) {
       ParamDto param = new ParamDto();
        param.setMessage(message);
       return param; 
    }
    
    @GetMapping("/mix/{product}/{id}") //mapea la ruta mix/{product}/{id} a este metodo, donde {product} y {id} son valores que se pasaran como parametros en la URL
    public Map<String, Object> mixPathVariable(@PathVariable String product, @PathVariable Long id ) {
        Map<String, Object> json = new HashMap<>();
        json.put("product", product);
        json.put("id", id);
        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody  User user) {
        //Hacer algo con el usuario, como guardarlo en la base de datos
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values( @Value ("${config.message}") String message) {
        Long code2 = environment.getProperty("config.code", Long.class); //Obtiene el valor de la propiedad config.code como un Long
        Map<String, Object> json = new HashMap<>();
        json.put("username", username);
        json.put("message", message);
        json.put("message2", environment.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valueList", valueList);
        json.put("valueString", valueString);
        json.put("valuesMap", valuesMap);
        json.put("product", product);
        json.put("description", description);
        json.put("price", price);
        json.put("code", code);
        json.put("code2", code2);
        return json;
    }
    
    
}