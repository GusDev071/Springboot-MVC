package com.gustavo.curso.springboot.webapp.springboot_web;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySources ({@PropertySource(value = "classpath:values.properties", encoding = "UTF-8")}) //Es una anotacion que permite cargar un archivo de propiedades externo en la aplicacion, en este caso values.properties

public class ValuesConfig {

}
