package ex1;

public class bai3 {

    public static void printMultiplicationTable(int n) {
        System.out.println("Bang cuu truong " + n + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }

        System.out.println();
    }

    public static void main(String[] args) {
        printMultiplicationTable(7);
        printMultiplicationTable(9);
    }
}
