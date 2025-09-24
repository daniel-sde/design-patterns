package behavioral.design.patterns.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class StockMarket {
    private Map<String, Double> stocks = new HashMap<>();
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        observers.add(o);
    }

    public void setStockPrice(String stock, double price) {
        stocks.put(stock, price);
        notifyObservers(stock, price);
    }

    private void notifyObservers(String stock, double price) {
        for (Observer o : observers) {
            o.update(stock, price);
        }
    }
}
