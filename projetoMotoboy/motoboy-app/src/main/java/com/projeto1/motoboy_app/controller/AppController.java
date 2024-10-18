package com.projeto1.motoboy_app.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //define que esta classe é um controlador REST
@RequestMapping("/api")// define a base para as URLs

public class AppController {
    @GetMapping("/status")// mapeia a URL/status para este método
    public ResponseEntity<String>status(){
        return ResponseEntity.ok("API funcionando com sucesso!");
    }

    @GetMapping("/versao")// mapeia a URL/status para este método
    public ResponseEntity<String>versao(){
        return ResponseEntity.ok("1.0");
    }
}
