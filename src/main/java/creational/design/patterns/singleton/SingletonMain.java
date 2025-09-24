package creational.design.patterns.singleton;

// Real-time Use Case: A logging service should have only one instance shared across the whole app.
public class SingletonMain {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application started.");
        logger2.log("User logged in.");

        System.out.println("Same logger instance? " + (logger1 == logger2));
    }
}

