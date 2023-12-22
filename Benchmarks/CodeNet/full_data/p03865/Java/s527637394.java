

import java.util.Scanner;

public class Main {
    public static void calculate(String s) {
        if (s.length() <= 2) {
            System.out.println("Second");
            return;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            if (s.length() % 2 == 1) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        } else {
            calculate(s.substring(1, s.length() - 1));
        }
    }
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        calculate(s);
    }
}
