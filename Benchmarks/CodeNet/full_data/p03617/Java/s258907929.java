
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long q = scanner.nextInt();
        final long h = scanner.nextInt();
        final long s = scanner.nextInt();
        final long d = scanner.nextInt();
        final long n = scanner.nextInt();

        final long l1 = Math.min(s, Math.min(h * 2, q * 4));
        final long l2 = Math.min(l1 * 2, d);

        if (n % 2 == 0) {
            System.out.println(n / 2 * l2);
        } else {
            System.out.println(n / 2 * l2 + l1);
        }
    }
}
