package creational.design.patterns.factory;

// Real-time Use Case: A system sends notifications via Email, SMS, or Push depending on the type.
public class FactoryMain {

    private static final String EMAIL = "EMAIL";
    private static final String SMS = "SMS";

    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification n1 = factory.getNotification(EMAIL);
        n1.notifyUser("Welcome to our platform!");

        Notification n2 = factory.getNotification(SMS);
        n2.notifyUser("Your OTP is 123456");
    }
}

