package behavioral.design.patterns.observer;

class WebApp implements Observer {
    public void update(String stock, double price) {
        System.out.println("Web App: " + stock + " is now $" + price);
    }
}
