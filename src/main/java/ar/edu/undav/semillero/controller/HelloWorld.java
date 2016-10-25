package ar.edu.undav.semillero.controller;
/******************************************************
 * Al runnear esto, si entro a localhost:8080/holamundo voy a ver HelloWorld
 * Documentación de que hace cada cosa : http://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-first-application.html#getting-started-first-application-run
 * Más completa : http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/#boot-features-developing-web-applications
 * 
 * The @RequestMapping annotation provides “routing” information. 
 * It is telling Spring that any HTTP request with the path “/” should be mapped to the home method. 
 * The @RestController annotation tells Spring to render the resulting string directly back to the caller.
 * 
 * 
 * @EnableAutoConfiguration annotation tells Spring Boot to “guess” how you will want to configure Spring, 
 * based on the jar dependencies that you have added.
 *****************************************************/
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class HelloWorld {

    @RequestMapping("/holamundo")
    String respuesta() {
        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(HelloWorld.class, args);
    }

}