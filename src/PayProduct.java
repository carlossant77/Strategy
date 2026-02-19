import context.PaymentMethod;

public class PayProduct {

    private PaymentMethod payMethod;

    public String pay() {
        return payMethod.pay();
    }

    public void setPayMethod(PaymentMethod payMethod) {
        this.payMethod = payMethod;
    }

}
