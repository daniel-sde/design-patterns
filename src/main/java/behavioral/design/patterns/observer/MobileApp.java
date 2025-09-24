package behavioral.design.patterns.observer;

class MobileApp implements Observer {
    public void update(String stock, double price) {
        System.out.println("Mobile App: " + stock + " is now $" + price);
    }
}
