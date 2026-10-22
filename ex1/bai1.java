package ex1;

import java.util.Scanner;

public class bai1 {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap mot so nguyen: ");
        int n = scanner.nextInt();

        if (isPrime(n)) {
            System.out.println(n + " la mot so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

        scanner.close();
    }
}
