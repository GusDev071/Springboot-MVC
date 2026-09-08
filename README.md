# Spring Boot Web Application

![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.8-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

## Descripción

Este es un proyecto de aplicación web desarrollado con **Spring Boot** (versión 4.0.8) y **Java 17**. El proyecto utiliza el patrón de arquitectura **MVC (Model-View-Controller)** para estructurar la aplicación y **Thymeleaf** como motor de plantillas para la capa de presentación (vistas). 

Es un proyecto ideal para aprender y entender los conceptos fundamentales del desarrollo web con el ecosistema Spring.

## Tecnologías Principales

- **Java 17**: Lenguaje de programación.
- **Spring Boot 4.0.8**: Framework principal para el desarrollo rápido y simplificado.
- **Spring Web MVC**: Módulo para la creación de aplicaciones web (RESTful y basadas en vistas).
- **Thymeleaf**: Motor de plantillas del lado del servidor para renderizar HTML.
- **Spring Boot Actuator**: Herramientas integradas para monitorear y gestionar la aplicación (endpoints de salud, métricas, etc).
- **Spring Boot DevTools**: Herramientas de desarrollo para agilizar el proceso (recarga automática, etc).
- **Maven**: Herramienta de gestión de dependencias y construcción del proyecto.

## Estructura del Proyecto

La estructura sigue las convenciones estándar de un proyecto Spring Boot con Maven:

- `src/main/java`: Contiene el código fuente Java (Controladores, Modelos, Servicios, etc).
- `src/main/resources`: 
  - `templates/`: Archivos HTML de Thymeleaf.
  - `static/`: Recursos estáticos como CSS, JavaScript e imágenes.
  - `application.properties` / `application.yml`: Archivo de configuración principal.
- `pom.xml`: Archivo de configuración de Maven donde se definen las dependencias.

## Requisitos Previos

Para compilar y ejecutar este proyecto, necesitarás tener instalado lo siguiente en tu sistema:

- [Java Development Kit (JDK) 17](https://adoptium.net/) o superior.
- [Apache Maven](https://maven.apache.org/) (Opcional, el proyecto incluye Maven Wrapper `mvnw`).
- Un IDE recomendado como IntelliJ IDEA, Eclipse o Visual Studio Code.

## Cómo Ejecutar la Aplicación

1. **Clonar el repositorio** (si aplica):
   ```bash
   git clone <url-del-repositorio>
   cd springboot-web
   ```

2. **Compilar y Ejecutar usando Maven Wrapper**:

   En Windows:
   ```cmd
   .\mvnw.cmd spring-boot:run
   ```

   En macOS/Linux:
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Acceder a la aplicación**:
   Una vez que la aplicación inicie correctamente, abre tu navegador web y visita:
   [http://localhost:8080](http://localhost:8080)

## Desarrollo y Contribución

Si deseas realizar cambios:
1. Asegúrate de estar ejecutando la aplicación (DevTools se encargará de recargar los cambios en las clases automáticamente).
2. Los cambios en las plantillas de Thymeleaf generalmente requieren recargar la página en el navegador.

## Licencia

[Especificar el tipo de licencia si corresponde, ej. MIT, Apache 2.0]
