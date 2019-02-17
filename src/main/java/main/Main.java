package main;

import pizza.*;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        CapriciosaPizza capriciosaPizza = new CapriciosaPizza(31.99,Arrays.asList("cheese","champignons","ham"));
//        HawaiPizza hawaiPizza = new HawaiPizza(29.99,Arrays.asList("cheese","pineaple","ham"));
//        MargheritaPizza margheritaPizza = new MargheritaPizza(24, Arrays.asList("cheese"));
        PizzaFactory pizzaFactory = new PizzaFactory();
        Pizza pizza1 = pizzaFactory.create(PizzaType.MARGHERITA,15.99,Arrays.asList("cheese"));
        Pizza pizza2 = pizzaFactory.create(PizzaType.FRUTTIDIMARE,25.00,Arrays.asList("cheese","shrimps"));

        pizza1.showPizzaInfo();
        pizza2.showPizzaInfo();

    }

}
