package structural.design.patterns.adapter;

class OldPaymentSystem {
    public void makePayment(double amount) {
        System.out.println("Payment of $" + amount + " done using Old System.");
    }
}
