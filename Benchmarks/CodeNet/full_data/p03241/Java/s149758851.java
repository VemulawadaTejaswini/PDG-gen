import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long m = scanner.nextInt();
        long div = m / n;
        if (m % n == 0) System.out.println(div);
        else {
            long maxDivisor = div + (m % n);
            long commonDivisor = div;
            long numberOfCommonDivisors = n - 1;
            if (numberOfCommonDivisors % 2 != 0)
                System.out.println(gcd(div, div + (m % n)));
            else {
                long maxVal = Long.MIN_VALUE;
                for (int i = 1; i < div; i++) {
                    long a = i;
                    long b = 2 * div - i;
                    maxVal = Math.max(maxVal, gcd(a, b));
                }
                System.out.println(gcd(maxVal, div + (m % n)));
            }
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
