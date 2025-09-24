package structural.design.patterns.adapter;

class PaymentAdapter implements NewPaymentGateway {
    private OldPaymentSystem oldSystem = new OldPaymentSystem();

    public void pay(String account, double amount) {
        System.out.println("Using account: " + account);
        oldSystem.makePayment(amount);
    }
}
