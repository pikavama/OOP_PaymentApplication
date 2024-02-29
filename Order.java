import java.lang.reflect.ParameterizedType;

public class Order{
    private String item;
    private int quantity;
    private double unitPrice;
    private double totalAmount;
    private PaymentMode paymentMode; //interface

    public Order{
        //default
    }

    public Order(String item, int quantity, double unitPrice){
        this.item = item;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }

    //setters
    public void setItem (String item){
        this.item = item;
    }

    public void setQuantity(int quantity){
        this.quantity = quantity;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }

    public void setTotalAmount(double totalAmount){
        this.totalAmount = totalAmount;
    }

    public void setPaymentMode(PaymentMode paymentMode){
        this.paymentMode = paymentMode;
    }

    //getters
    public String getItem(){
        return item;
    }

    public int getQuantity(){
        return quantity;
    }

    public double getUnitPrice(){
        return unitPrice;
    }

    public double getTotalAmount(){
        return totalAmount;
    }

    public PaymentMode getPaymentMode(){
        return paymentMode;
    }

    //compute total amount
    public double totalAmount(){

    }
}