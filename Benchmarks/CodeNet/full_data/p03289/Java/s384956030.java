
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if (!s.substring(0, 1).equals("A") || s.substring(1, 2).equals("C")) {
            System.out.println("WA");
        } else {
            int c = 0;
            for (int i = 2 ; i < s.length(); i++) {
                if (s.substring(i, i + 1).equals("C")) {
                    c++;
                }


            }
            int d = 0;
            for (int i = 0; i < s.length(); i++) {
                if (Character.isUpperCase(s.charAt(i))) {
                    d ++;
                }
            }
            if (c == 1 && !s.substring(s.length() -1, s.length()).equals("C") && d == 2) {

                System.out.println("AC");
            } else {
                System.out.println("WA");
            }
        }
    }

}