package ex2;

public class MainOrder {
    public static void applyDiscount(Order order, double discountPercent) {
        double discountAmount =
                order.getTotalAmount() * discountPercent / 100;

        double newTotal =
                order.getTotalAmount() - discountAmount;

        order.setTotalAmount(newTotal);
    }

    public static void main(String[] args) {
        Order order = new Order("ORD001", 1000000);

        System.out.println("Ma don hang: " + order.getOrderId());
        System.out.println("Tong tien ban dau: "
                + order.getTotalAmount() + " VNĐ");

        applyDiscount(order, 15);

        System.out.println("Tong tien sau giam gia: "
                + order.getTotalAmount() + " VNĐ");
    }
}
