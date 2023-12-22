
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextLong();
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();

        if ((a + b) % 2 == 0) {
            System.out.println((b - a) / 2);
            return;
        }

        if (a > n - b) {
            System.out.println(a + (b - a) / 2);
        } else {
            System.out.println(n - b + (b - a) / 2);
        }
    }
}
