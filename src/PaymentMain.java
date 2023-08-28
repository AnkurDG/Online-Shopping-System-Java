import java.util.UUID;

interface PaymentMethod {
    void processPayment(double amount);
}

// Credit Card Payment Implementation
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public CreditCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        // Implement credit card payment processing
        System.out.println("Processing credit card payment of $" + amount);
    }
}

// Debit Card Payment Implementation
class DebitCardPayment implements PaymentMethod {
    private String cardNumber;
    private String cardHolderName;

    public DebitCardPayment(String cardNumber, String cardHolderName) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
    }

    @Override
    public void processPayment(double amount) {
        // Implement debit card payment processing
        System.out.println("Processing debit card payment of $" + amount);
    }
}

// Net Banking Payment Implementation
class NetBankingPayment implements PaymentMethod {
    private String bankName;
    private String accountNumber;

    public NetBankingPayment(String bankName, String accountNumber) {
        this.bankName = bankName;
        this.accountNumber = accountNumber;
    }

    @Override
    public void processPayment(double amount) {
        // Implement net banking payment processing
        System.out.println("Processing net banking payment of $" + amount);
    }
}


class Payment{
    private UUID paymentID;
    private double amount;
    private String paymentMethod;

    public Payment(){}
    public Payment(double amount,String paymentMethod){
        this.amount=amount;
        this.paymentMethod=paymentMethod;
    }

    // Getters

    public UUID getPaymentID() {
        return paymentID;
    }

    public double getAmount(){
        return amount;
    }

    public String getPaymentMethod(){
        return paymentMethod;
    }

    //Setters
    public void setAmount(double amount){
        this.amount = amount;
    }

    public void setPaymentMethod(String paymentMethod){
        this.paymentMethod=paymentMethod;
    }

    // payment method functions
    public void makePayment() {
        // Process payment using the selected payment method
    }
}

