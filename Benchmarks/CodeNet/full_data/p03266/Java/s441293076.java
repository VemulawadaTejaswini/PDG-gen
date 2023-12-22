
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int k = scanner.nextInt();

        if (k % 2 == 0) {
            int counterA = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == 0) {
                    counterA++;
                }
            }

            int counterB = 0;
            for (int i = 1; i <= n; i++) {
                if (i % k == k / 2) {
                    counterB++;
                }
            }

            System.out.println((int) Math.pow(counterA, 3) + (int) Math.pow(counterB, 3));
            return;
        }

        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                counter++;
            }
        }

        System.out.println((int) Math.pow(counter, 3));
    }
}
