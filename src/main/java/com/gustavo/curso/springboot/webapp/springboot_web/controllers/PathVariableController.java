package com.gustavo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.gustavo.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import java.util.HashMap;
import java.util.Map;



@RestController 
@RequestMapping ("/api/var")
public class PathVariableController {

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
}