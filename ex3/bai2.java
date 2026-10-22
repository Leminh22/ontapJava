package ex3;

public class bai2 {
    public static String formatName(String rawName) {

        String name = rawName.trim().toLowerCase();


        String[] words = name.split("\\s+");


        String result = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i].substring(0, 1).toUpperCase()
                    + words[i].substring(1);


            if (i > 0) {
                result += " ";
            }

            result += word;
        }

        return result;
    }

    public static void main(String[] args) {
        String rawName = "  nGUYễn  vĂn   aN  ";

        String formattedName = formatName(rawName);

        System.out.println("Ten ban dau: [" + rawName + "]");
        System.out.println("Ten sau khi chuan hoa: [" + formattedName + "]");
    }
}
