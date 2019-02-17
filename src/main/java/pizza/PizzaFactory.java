package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza create(PizzaType pizzaType, double coast, List<String> components) {
        if (pizzaType.equals(PizzaType.CAPRICIOSA)) {
            return new CapriciosaPizza(15.90, null);
        } else if (pizzaType.equals(PizzaType.FRUTTIDIMARE)){
           return new FruttiDiMare(20.00,null);
        }else if (pizzaType.equals(PizzaType.HAWAI)){
            return new HawaiPizza(25.00,null);
        }else if (pizzaType.equals(PizzaType.MARGHERITA)){
            return new MargheritaPizza(12.50,null);
        }
        return null;
    }
}
