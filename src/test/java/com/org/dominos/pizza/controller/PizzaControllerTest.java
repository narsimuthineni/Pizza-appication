package com.org.dominos.pizza.controller;


import com.org.dominos.pizza.model.DominosPizza;
import com.org.dominos.pizza.repository.PizzaRepo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class PizzaControllerTest {

    @InjectMocks

    private PizzaController pizzaController;

    @Mock
    private PizzaRepo pizzaRepo;

    @Test
    public void createPizzaRecord(){
        DominosPizza dominosPizza= new DominosPizza();
        dominosPizza.setSmallPizza("cheeks");
        dominosPizza.setPizzaId(101);
        dominosPizza.setMediumPizza("mutton cheeks");
        dominosPizza.setTotalBill(8000f);
        pizzaController.createPizzaRecord(dominosPizza);
        Mockito.verify(pizzaRepo,Mockito.times(1)).save(dominosPizza);

    }
    @Test
    public void getSmallPizza(){

        DominosPizza dominosPizza=new DominosPizza();
        dominosPizza.setSmallPizza("chicken");
        dominosPizza.setMediumPizza("cheek");
        dominosPizza.setPizzaId(100);
        dominosPizza.setTotalBill(72727f);
        Mockito.when(pizzaRepo.findBySmallPizza(dominosPizza.getSmallPizza())).thenReturn((List<DominosPizza>) dominosPizza);
        DominosPizza dominosPizza1= (DominosPizza) pizzaController.getSmallPizza( dominosPizza.getSmallPizza());
        Assertions.assertEquals(dominosPizza,dominosPizza1);

    }


}
