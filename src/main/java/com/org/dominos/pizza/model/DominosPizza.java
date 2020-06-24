package com.org.dominos.pizza.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.io.Serializable;
import java.util.Collection;

@SuppressWarnings("ALL")
@Document("/pizza")
public class DominosPizza implements Serializable {

    @Id
    int pizzaId;
    String smallPizza;
    String mediumPizza;
    float totalBill;

    public DominosPizza() {

    }

    public int getPizzaId() {
        return pizzaId;
    }

    public void setPizzaId(int pizzaId) {
        this.pizzaId = pizzaId;
    }

    public String getSmallPizza() {
        return smallPizza;
    }

    public void setSmallPizza(String smallPizza) {
        this.smallPizza = smallPizza;
    }

    public String getMediumPizza() {
        return mediumPizza;
    }

    public void setMediumPizza(String mediumPizza) {
        this.mediumPizza = mediumPizza;
    }

    public float getTotalBill() {
        return totalBill;
    }

    public void setTotalBill(float totalBill) {
        this.totalBill = totalBill;
    }

    public DominosPizza(int pizzaId, String smallPizza, String mediumPizza, float totalBill) {
        this.pizzaId = pizzaId;
        this.smallPizza = smallPizza;
        this.mediumPizza = mediumPizza;
        this.totalBill = totalBill;

    }
}
