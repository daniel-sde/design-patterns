package structural.design.patterns.adapter;

interface NewPaymentGateway {
    void pay(String account, double amount);
}
