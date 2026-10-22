package ex2;

public class MainProduct {
    public static Product getMostExpensive(Product p1, Product p2) {
        if (p1.getPrice() > p2.getPrice()) {
            return p1;
        } else {
            return p2;
        }
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1500.0);
        Product product2 = new Product("Phone", 800.0);

        Product result = getMostExpensive(product1, product2);

        System.out.println("San pham dat hon la: " + result.getName());
        System.out.println("Gia: " + result.getPrice());
    }
}
