package creational.design.patterns.factory;

class EmailNotification implements Notification {
    public void notifyUser(String message) {
        System.out.println("Sending Email: " + message);
    }
}
