package demo;

interface PaymentClient {

    int i = 10; // public static final

    void pay(); // public abstract (abstract methdos)

    void refund();


    default String rollback() {
        return null;
    }

}

public class DemoInterfaceExample implements PaymentClient {

    @Override
    public void pay() {
        System.out.println("Pay transaction");
    }

    @Override
    public void refund() {
        System.out.println("Refund transaction");
    }

    @Override
    public String rollback() {
        return "Rollback transaction";
    }

    public static void main(String[] args) {

        PaymentClient paymentClient = new DemoInterfaceExample();

        paymentClient.pay();

        paymentClient.refund();
    }
}
