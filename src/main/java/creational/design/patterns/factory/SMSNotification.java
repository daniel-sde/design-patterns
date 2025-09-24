package creational.design.patterns.factory;

class SMSNotification implements Notification {
    public void notifyUser(String message) {
        System.out.println("Sending SMS: " + message);
    }
}
