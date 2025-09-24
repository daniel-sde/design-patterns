package structural.design.patterns.adapter;


// Real-time Use Case: An old payment system provides payment in a different method signature; we need to adapt it to a new interface.
public class AdapterMain {
    public static void main(String[] args) {
        NewPaymentGateway gateway = new PaymentAdapter();
        gateway.pay("user123", 500.00);
    }
}
