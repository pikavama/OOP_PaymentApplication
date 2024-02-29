public class PaymentApp{
    public static void main(String[] args){

        Order gcash = new GCash("keyboard", 300.0, 10, new GCash());

        System.out.println("Order item is " + gcash.getItem() + "." +
                        "\nUnit price is " + gcash.getUnitPrice() +
                        "\nQuantity is " + gcash.getQuantity());

        //payment if Gcash
        System.out.println("\nPayment order details if " + gcash.getClass().getSimpleName() + 
                        "\nDiscount rate is " + gcash.getPaymentMode().determineDiscountRate() +
                        "\nPayment amount is " + gcash.getTotalAmount());

        //payment if Maya
        Order maya = new Maya();
        maya.setItem("keyboard");
        maya.setUnitPrice(300.0);
        maya.setQuantity(10);
        maya.setPaymentMode(new Maya());
        maya.setTotalAmount();

        System.out.println("\nPayment order details if " + maya.getClass().getSimpleName() +
                        "\nDiscount rate is " + maya.getPaymentMode().determineDiscountRate() +
                        "\nPayment amount is " + maya.getTotalAmount());

        //payment if ShopeePay
        Order shopeePay = new ShopeePay("keyboard",300.0, 10, new ShopeePay());

        System.out.println("\nPayment order details if " + shopeePay.getClass().getSimpleName() +
                        "\nDiscount rate is " + shopeePay.getPaymentMode().determineDiscountRate() +
                        "\nPayment amount is " + shopeePay.getTotalAmount());

    }
}