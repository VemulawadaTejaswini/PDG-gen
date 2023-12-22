
import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();

        long multiple = 1;
        long counter = 0;
        for (long i = 1; multiple <= Math.min(a, b); i++) {
            multiple *= i;
            if (a % multiple == 0 && b % multiple == 0) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}
