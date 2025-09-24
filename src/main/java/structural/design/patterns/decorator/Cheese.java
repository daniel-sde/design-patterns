package structural.design.patterns.decorator;

class Cheese extends PizzaDecorator {
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    public String getDescription() {
        return pizza.getDescription() + ", Cheese";
    }

    public double cost() {
        return pizza.cost() + 50;
    }
}
