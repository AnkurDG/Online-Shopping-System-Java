
class Payment{
    private double amount;
    private String paymentMethod;

    public Payment(){}
    public Payment(double amount,String paymentMethod){
        this.amount=amount;
        this.paymentMethod=paymentMethod;
    }

    // Getters
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
    public void payWithCreditCard() { /* code to process credit card payment */ }
    public void payWithDebitCard() { /* code to process debit card payment */ }
    public void payWithNetBanking() { /* code to process net banking payment */ }


}


public class PaymentMain {
}
