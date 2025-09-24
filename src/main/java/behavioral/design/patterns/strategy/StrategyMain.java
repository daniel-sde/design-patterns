package behavioral.design.patterns.strategy;

// Real-time Use Case: A travel app offers different routes – by car, by train, or by flight.
public class StrategyMain {
    private static final String CHENNAI = "Chennai";

    public static void main(String[] args) {
        TravelPlanner planner = new TravelPlanner();

        planner.setStrategy(new CarTravel());
        planner.planTrip(CHENNAI, "Bangalore");

        planner.setStrategy(new TrainTravel());
        planner.planTrip(CHENNAI, "Delhi");

        planner.setStrategy(new FlightTravel());
        planner.planTrip(CHENNAI, "New York");
    }
}

