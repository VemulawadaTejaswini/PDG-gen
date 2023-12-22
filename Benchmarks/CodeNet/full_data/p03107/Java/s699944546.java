import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String[] words = word.split("");
        int num0 = 0;
        int num1 = 0;

        for (int n = 0; n < words.length; n++) {
            if (words[n].equals("0")) {
                num0 = num0 + 1;
            }
            else {
                num1 = num1 + 1;
            }
        }
         if (num1 > num0) {
            System.out.println(num0 * 2);
        } else if (num0 > num1) {
            System.out.println(num1 * 2);
        } else {
            System.out.println(num1 + num0);
        }
    }
}