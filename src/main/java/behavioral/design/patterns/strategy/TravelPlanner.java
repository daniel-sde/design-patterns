package behavioral.design.patterns.strategy;

class TravelPlanner {
    private TravelStrategy strategy;

    public void setStrategy(TravelStrategy strategy) {
        this.strategy = strategy;
    }

    public void planTrip(String from, String to) {
        strategy.travel(from, to);
    }
}
