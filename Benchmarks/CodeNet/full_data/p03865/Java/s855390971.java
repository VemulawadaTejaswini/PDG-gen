

import java.util.Scanner;

public class Main {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            if (j - i + 1 <= 2) {
                System.out.println("Second");
                return;
            }
            if (s.charAt(i) != s.charAt(j)) {
                if ((j - i + 1) % 2 == 1) {
                    System.out.println("First");
                } else {
                    System.out.println("Second");
                }
                return;
            } else {
                ++i;
                --j;
            }
        }

    }
}
