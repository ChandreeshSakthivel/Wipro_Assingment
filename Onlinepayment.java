abstract class PaymentMethod {
    protected double amount;
    public PaymentMethod(double amount) {
        this.amount = amount;
    }
    public abstract void processPayment();
}
class CreditCard extends PaymentMethod {
    private static final double TRANSACTION_FEE = 2.5;
    public CreditCard(double amount) {
        super(amount);
    }
    public void processPayment() {
        double totalAmount = amount + TRANSACTION_FEE;
        System.out.println("Processing Credit Card Payment");
        System.out.println("Amount: $" + amount + " + Fee: $" + TRANSACTION_FEE);
        System.out.println("Total Charged: $" + totalAmount);
    }
}
class PayPal extends PaymentMethod {
    public PayPal(double amount) {
        super(amount);
    }
    public void processPayment() {
        System.out.println("Processing PayPal Payment");
        System.out.println("Amount: $" + amount);
        System.out.println("No extra fee applied.");
    }
}
public class Onlinepayment {
    public static void processTransaction(PaymentMethod paymentMethod) {
        paymentMethod.processPayment();
    }
    public static void main(String[] args) {
        PaymentMethod payment1 = new CreditCard(100);
        PaymentMethod payment2 = new PayPal(200);
        processTransaction(payment1);
        processTransaction(payment2);
    }
}

