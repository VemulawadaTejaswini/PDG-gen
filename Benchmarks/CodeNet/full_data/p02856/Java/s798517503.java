
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int m = scanner.nextInt();
        long digit = 0;
        long all = 0;
        for (int i = 0; i < m; i++) {
            final long d = scanner.nextLong();
            final long c = scanner.nextLong();

            digit += c;
            all += d * c;
        }

        System.out.println(digit - 1 + all / 10L);
    }
}
