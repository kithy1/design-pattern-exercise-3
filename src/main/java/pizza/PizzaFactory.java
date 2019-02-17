package pizza;

import java.util.List;

public class PizzaFactory {
    public Pizza create(PizzaType pizzaType, double coast, List<String> components) {
        if (pizzaType.equals(PizzaType.CAPRICIOSA)) {
            return new CapriciosaPizza(coast, components);
        } else if (pizzaType.equals(PizzaType.FRUTTIDIMARE)){
           return new FruttiDiMare(coast,components);
        }else if (pizzaType.equals(PizzaType.HAWAI)){
            return new HawaiPizza(coast,components);
        }else if (pizzaType.equals(PizzaType.MARGHERITA)){
            return new MargheritaPizza(coast,components);
        }
        return null;
    }
}
