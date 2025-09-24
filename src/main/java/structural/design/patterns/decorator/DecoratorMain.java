package structural.design.patterns.decorator;

// Real-time Use Case: A pizza order can have extra cheese, mushrooms, or olives added dynamically.
public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizza = new PlainPizza();
        System.out.println(pizza.getDescription() + " Rs." + pizza.cost());

        pizza = new Cheese(pizza);
        System.out.println(pizza.getDescription() + " Rs." + pizza.cost());

        pizza = new Olives(pizza);
        System.out.println(pizza.getDescription() + " Rs." + pizza.cost());
    }
}
