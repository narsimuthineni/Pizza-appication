package com.org.dominos.pizza.repository;

import com.org.dominos.pizza.model.DominosPizza;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface PizzaRepo extends MongoRepository<DominosPizza,Integer> {

    public DominosPizza findByPizzaId(Integer pizzaId);
    public List<DominosPizza>  findBySmallPizza(String smallPizza);
    public  List<DominosPizza> findBySmallPizzaAndPizzaId(String smallPizza,Integer pizzaId);
    public void deleteByPizzaId(Integer pizzaId);
    public void  deleteBySmallPizza(String smallPizza);
}
