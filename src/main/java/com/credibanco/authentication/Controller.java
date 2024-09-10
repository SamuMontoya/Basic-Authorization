package com.credibanco.authentication;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class Controller {

    @GetMapping("/public")
    public String getPublic(){
        return "👋 Hola! eres un usuario público";
    }

    @GetMapping("/private")
    public String getPrivate(){
        return "Hey! eres un usuario privado 🕵️‍♂️";
    }
    
}
