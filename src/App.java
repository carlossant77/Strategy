import context.PaymentMethod;
import contracts.CreditCardPayment;
import contracts.PixPayment;

public class App {
    public static void main(String[] args) throws Exception {
        PaymentMethod pixPay = new PixPayment();
        PaymentMethod creditCardPay = new CreditCardPayment();

        PayProduct payProduct = new PayProduct();
        payProduct.setPayMethod(pixPay);
        System.out.println(payProduct.pay());

        payProduct.setPayMethod(creditCardPay);
        System.out.println(payProduct.pay());

    }
}
