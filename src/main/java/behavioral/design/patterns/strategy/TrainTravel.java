package behavioral.design.patterns.strategy;

class TrainTravel implements TravelStrategy {
    public void travel(String from, String to) {
        System.out.println("Travelling from " + from + " to " + to + " by Train.");
    }
}
