

import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int x = scanner.nextInt();
        if (x < 100) {
            System.out.println(0);
        }

        final int divide = x / 100;
        final int mod = x % 100;
        System.out.println(mod <= divide ? 1 : 0);
    }
}
