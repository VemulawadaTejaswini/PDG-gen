import java.util.Scanner;

public class Main {
    public static void main(final String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long n = scanner.nextLong();
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        final long c = scanner.nextLong();
        final long d = scanner.nextLong();
        final long e = scanner.nextLong();

        final long min = Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
        /*
        if (min == a) {
            System.out.println(split(n, a) + 5);
        } else if (min == b) {
            System.out.println(split(n, b) + 4);
        } else if (min == c) {
            System.out.println(split(n, c) + 3);
        } else if (min == d) {
            System.out.println(split(n, d) + 2);
        } else {
            System.out.println(split(n, e) + 1);
        }
         */
        System.out.println(split(n,min) + 4);
        scanner.close();
    }

    private static long split(final long a, final long b) {
        if (a % b == 0) return a / b;
        else return a / b + 1;
    }
}
