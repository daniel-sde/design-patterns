package structural.design.patterns.decorator;

class PlainPizza implements Pizza {
    public String getDescription() {
        return "Plain Pizza";
    }

    public double cost() {
        return 200;
    }
}
