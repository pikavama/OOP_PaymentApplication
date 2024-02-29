public class ShopeePay extends Order implements  PaymentMode{
    public ShopeePay(){
    }

    public ShopeePay(String item, double unitPrice, int quantity, PaymentMode paymentMode) {
        super(item, unitPrice, quantity, paymentMode);
    }

    @Override
    public double determineDiscountRate() {
        return 0.1;
    }
}