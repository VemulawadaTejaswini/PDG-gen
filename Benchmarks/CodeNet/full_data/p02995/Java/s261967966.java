import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        final long c = scanner.nextLong();
        final long d = scanner.nextLong();

        final long gcdVal = gcd(c, d);
        final long cd = c * d / gcdVal;

        System.out.println(b - b / c - b / d + b / cd - (a - 1) + (a - 1) / c + (a - 1) / d - (a - 1) / cd);
    }

    private static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b, a);
        }

        if (b == 0) return a;

        return gcd(b, a % b);
    }
}