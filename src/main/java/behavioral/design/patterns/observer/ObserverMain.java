package behavioral.design.patterns.observer;

// Real-time Use Case: A stock trading app notifies all subscribed users when a stock price changes.
public class ObserverMain {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();
        market.addObserver(new MobileApp());
        market.addObserver(new WebApp());

        market.setStockPrice("AAPL", 180.50);
        market.setStockPrice("GOOG", 2800.00);
    }
}
