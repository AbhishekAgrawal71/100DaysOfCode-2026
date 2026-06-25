import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

            if (ch != 'a' && ch != 'e' && ch != 'i' &&
                ch != 'o' && ch != 'u') {
                result += "." + ch;
            }
        }

        System.out.println(result);
    }
}