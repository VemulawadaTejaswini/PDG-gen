import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        if (s.charAt(0) != 'A') {
            System.out.println("WA");
            return;
        }

        int c = 0;
        for (int i = 2; i <= s.length() - 2; i++) {
            if (s.charAt(i) == 'C') {
                c++;
            }
        }

        if (c != 1) {
            System.out.println("WA");
            return;
        }

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 == 'A' || c1 == 'C') {
                continue;
            }

            if ((c1 >= 'a') && (c1 <= 'z')) {

            } else {
                System.out.println("WA");
                return;
            }
        }
        System.out.println("AC");

    }
}
