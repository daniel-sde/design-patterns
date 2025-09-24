package creational.design.patterns.factory;

class PushNotification implements Notification {
    public void notifyUser(String message) {
        System.out.println("Sending Push Notification: " + message);
    }
}
