package com.gustavo.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import com.gustavo.curso.springboot.webapp.springboot_web.models.dto.ParamDto;
import com.gustavo.curso.springboot.webapp.springboot_web.models.dto.ParamMixDto;
import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping ("/api/params") //mapea la ruta /api/params a este controlador
public class RequestParamsController {

    @GetMapping("/foo")//mapea la ruta foo a este metodo
    public ParamDto foo(@RequestParam(required  = false, defaultValue = "No message provided") String message) { // Se utiliza @RequestParam para obtener el valor del parámetro de la solicitud HTTP. El parámetro "message" es opcional y tiene un valor predeterminado de "No message provided" si no se proporciona en la solicitud.
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }

    @GetMapping("/bar")
    public ParamMixDto bar(@RequestParam String text, @RequestParam Integer code) { // Se utiliza @RequestParam para obtener los valores de los parámetros "text" y "code" de la solicitud HTTP. Ambos parámetros son obligatorios y deben proporcionarse en la solicitud.

        ParamMixDto param = new ParamMixDto();
        param.setMessage(text);
        param.setCode(code);
        return param;
    }
    
    @GetMapping("/request")
    public ParamMixDto request(HttpServletRequest request) { // Se utiliza HttpServletRequest para obtener los valores de los parámetros "message" y "code" de la solicitud HTTP. Esto permite acceder a los parámetros directamente desde el objeto de solicitud, en lugar de utilizar @RequestParam. Los parámetros son obligatorios y deben proporcionarse en la solicitud.
        
        Integer code = 0;
        try {
            code = Integer.parseInt(request.getParameter("code"));
        } catch (NumberFormatException e) {
            // Manejar el error si el parámetro "code" no es un número válido
        }
        ParamMixDto param = new ParamMixDto();
        param.setMessage(request.getParameter("message"));
        param.setCode(code);
        return param;
    }
    

}
