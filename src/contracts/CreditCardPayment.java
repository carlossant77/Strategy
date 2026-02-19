package contracts;

import context.PaymentMethod;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public String pay() {
        return "Paying with credit card...";
    }

}
