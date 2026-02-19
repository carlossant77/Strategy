package contracts;

import context.PaymentMethod;

public class PixPayment implements PaymentMethod {

    @Override
    public String pay() {
        return "Paying with pix...";
    }

}
