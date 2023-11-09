package com.limadev.cardapio.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Declaração necessária para identificar que é de uma API Rest
@RequestMapping("food") // Indica qual vai ser o endereço para requisições
public class FoodControler {
    @GetMapping // Indica que o método será o Get
    public void getAll() {
        
    }
}
