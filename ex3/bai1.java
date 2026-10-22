package ex3;

public class bai1 {

        // Ham kiem tra chuoi doi xung
        public static boolean isPalindrome(String str) {
            // Buoc 1: Chuan hoa chuoi
            String normalized = str.toLowerCase()
                    .replaceAll("\\s+", "");

            // Buoc 2: Dao nguoc chuoi
            String reversed = "";

            for (int i = normalized.length() - 1; i >= 0; i--) {
                reversed += normalized.charAt(i);
            }

            // Buoc 3: So sanh hai chuoi
            return normalized.equals(reversed);
        }

        public static void main(String[] args) {
            String str1 = "MadAm";
            String str2 = "Hello";
            String str3 = "A man a plan a canal Panama";

            System.out.println(str1 + ": " + isPalindrome(str1));
            System.out.println(str2 + ": " + isPalindrome(str2));
            System.out.println(str3 + ": " + isPalindrome(str3));
        }


}
