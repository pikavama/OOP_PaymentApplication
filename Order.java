public class Order {

    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode paymentMode; //interface

    public Order(){
        //default
    }

    public Order(String item, double unitPrice, int quantity, PaymentMode paymentMode) {
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.paymentMode = paymentMode;
        this.totalAmount = totalAmount();
    }

    //setters
    public void setItem(String item) {
        this.item = item;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
    public void setTotalAmount() {
        this.totalAmount = totalAmount();
    }

    //getters
    public String getItem() {
        return item;
    }
    public int getQuantity() {
        return quantity;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public PaymentMode getPaymentMode() {
        return paymentMode;
    }
    public double getTotalAmount() {
        return totalAmount;
    }

    //to calculate total amount
    public double totalAmount(){
        double discount = this.unitPrice*this.paymentMode.determineDiscountRate();
        double amount = this.unitPrice - discount;
        double total = amount*this.quantity;
        return total;
    }
}