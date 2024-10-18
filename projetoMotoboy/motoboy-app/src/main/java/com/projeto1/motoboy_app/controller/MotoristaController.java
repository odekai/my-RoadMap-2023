package com.projeto1.motoboy_app.controller;
import com.projeto1.motoboy_app.entities.Motoboy;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController //define que esta classe é um controlador REST
@RequestMapping("/motoboy")// define a base para as URLs
public class MotoristaController {

    @GetMapping("/listar")
    public ResponseEntity<List<Motoboy>> listar(){
        Motoboy motoboy1 = new Motoboy();
        motoboy1.nome="pedro";
        motoboy1.placa="12313dw";

        List<Motoboy> lista = new ArrayList<>();
        lista.add(motoboy1);

        return ResponseEntity.ok(lista);
    }
}
