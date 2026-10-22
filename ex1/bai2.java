package ex1;

public class bai2 {
    public static int findMax(int[] arr) {
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {12, 5, 45, 23, 99, 8};

        int result = findMax(arr);

        System.out.println("Gia tri lon nhat trong mang : " + result);
    }
}
