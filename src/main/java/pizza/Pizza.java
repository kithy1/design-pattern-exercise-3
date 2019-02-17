package pizza;

import java.util.List;

public abstract class Pizza {
    private double cost;
    private List<String> components;
    private PizzaType pizzaType;

    public Pizza(double cost, List<String> components, PizzaType pizzaType) {
        this.cost = cost;
        this.components = components;
        this.pizzaType = pizzaType;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "cost=" + cost +
                ", components=" + components +
                ", pizzaType=" + pizzaType +
                '}';
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public List<String> getComponents() {
        return components;
    }

    public void setComponents(List<String> components) {
        this.components = components;
    }

    public PizzaType getPizzaType() {
        return pizzaType;
    }

    public void setPizzaType(PizzaType pizzaType) {
        this.pizzaType = pizzaType;
    }
    public void showPizzaInfo(){
        System.out.println(this.toString());
    }
}
