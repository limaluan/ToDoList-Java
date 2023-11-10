package com.limadev.cardapio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limadev.cardapio.food.Food;
import com.limadev.cardapio.food.FoodRepository;
import com.limadev.cardapio.food.FoodRequestDTO;
import com.limadev.cardapio.food.FoodResponseDTO;

@RestController // Declaração necessária para identificar que é de uma API Rest
@RequestMapping("food") // Indica qual vai ser o endereço para requisições
public class FoodControler {
    @Autowired
    private FoodRepository repository; // Define uma variavel repository com o tipo FoodRepository

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping // Indica que o método será o Get
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = repository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data) {
        Food foodData = new Food(data);
        repository.save(foodData);
        return;
    }
}
