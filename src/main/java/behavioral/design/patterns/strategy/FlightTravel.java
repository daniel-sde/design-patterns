package behavioral.design.patterns.strategy;

class FlightTravel implements TravelStrategy {
    public void travel(String from, String to) {
        System.out.println("Travelling from " + from + " to " + to + " by Flight.");
    }
}
