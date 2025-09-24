package creational.design.patterns.factory;

class NotificationFactory {
    public Notification getNotification(String type) {
        if (type.equalsIgnoreCase("EMAIL")) return new EmailNotification();
        if (type.equalsIgnoreCase("SMS")) return new SMSNotification();
        if (type.equalsIgnoreCase("PUSH")) return new PushNotification();
        return null;
    }
}
