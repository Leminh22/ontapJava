package ex2;

public class Order {
    private String orderId;
    private double totalAmount;

    // Constructor
    public Order(String orderId, double totalAmount) {
        this.orderId = orderId;
        this.totalAmount = totalAmount;
    }

    // Getter
    public String getOrderId() {
        return orderId;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    // Setter
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }
}
