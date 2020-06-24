package com.org.dominos.pizza.controller;


import com.org.dominos.pizza.model.DominosPizza;
import com.org.dominos.pizza.repository.PizzaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pizza")

public class PizzaController {

    @Autowired
    private PizzaRepo pizzaRepo;

    @PostMapping("/create")
    public void createPizzaRecord(@RequestBody DominosPizza dominosPizza) {
        pizzaRepo.save(dominosPizza);
    }

    @GetMapping("/getAll")
    public List<DominosPizza> getAll() {
        return pizzaRepo.findAll();
    }

    @GetMapping("/getPizzaId/{pizzaId}")
    public DominosPizza getByPizzaId(@PathVariable Integer pizzaId) {
        return pizzaRepo.findByPizzaId(pizzaId);
    }

    @GetMapping("/getSmallPizza/{smallPizza}")
    public List<DominosPizza> getSmallPizza(@PathVariable String smallPizza) {
        return pizzaRepo.findBySmallPizza(smallPizza);
    }

    @GetMapping("/getSmallPizzaAndPizzaId/{smallPizza}/{pizzaId}")
    public List<DominosPizza> getBySmallPizzaAndPizzaId(@PathVariable String smallPizza, @PathVariable Integer pizzaId) {
        return pizzaRepo.findBySmallPizzaAndPizzaId(smallPizza, pizzaId);
    }

    @DeleteMapping("/DeletePizzaId/{pizzaId}")
    public void deletePizzaId(@PathVariable Integer pizzaId) {
        pizzaRepo.deleteByPizzaId(pizzaId);
    }

    /*@DeleteMapping("/deleteAll")
        public void deleteAll(){
        pizzaRepo.deleteAll();
    }*/
    @DeleteMapping("/deleteSmallPizza/{smallPizza}")
    public void deleteSmallPizza(@PathVariable String smallPizza) {
        pizzaRepo.deleteBySmallPizza(smallPizza);
    }

    @PutMapping("/updateRecords")
    public String updateRecords(@RequestBody DominosPizza dominosPizza) {
        pizzaRepo.save(dominosPizza);
        return "update sucess fully";
    }

    @PutMapping("/updatePizzaIdAndSmallPizza/{pizzaId}/{smallPizza}")
    public void updatePizzaIdAndSmallPizza(@PathVariable Integer pizzaId, @PathVariable String smallPizza) {
        DominosPizza dominosPizza = pizzaRepo.findByPizzaId(pizzaId);
        dominosPizza.setSmallPizza(smallPizza);
        pizzaRepo.save(dominosPizza);

    }

    @PutMapping("updatePizzaId/{pizzaId}")
    public void updatePizzaId(@PathVariable Integer pizzaId) {
        pizzaRepo.findByPizzaId(pizzaId);
    }


}
