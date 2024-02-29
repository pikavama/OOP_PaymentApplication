public class GCash extends Order implements PaymentMode {
    public GCash(){
        //default
    }

    public Gcash(String item, double unitPrice, int quantity, PaymentMode paymentMode){
        super (item, unitPrice, quantity, paymentMode);
    }

    @Override
    public double determineDiscountRate(){
        return 0.0;
    }
}