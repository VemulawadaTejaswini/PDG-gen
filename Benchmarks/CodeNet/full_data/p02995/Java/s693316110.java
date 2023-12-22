import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long lcm = lcm(c, d);

        long start = 0;
        long startc = 0;
        long startd = 0;

        int sum = 0;
        int sumc = 0;
        int sumd = 0;

        for (int i = 1; ; i++) {
            if (lcm * i > a) {
                start = lcm * i;
                break;
            }
        }
        for (int i = 1; ; i++) {
            if (c * i > a) {
                startc = c * i;
                break;
            }
        }
        for (int i = 1; ; i++) {
            if (d * i > a) {
                startd = d * i;
                break;
            }
        }
        for (long i = start; i <= b; i += lcm) {
            sum++;
        }
        for (long i = startc; i <= b; i += c) {
            sumc++;
        }
        for (long i = startd; i <= b; i += d) {
            sumd++;
        }

        System.out.print(b - a - sumc - sumd + sum);
    }

    public static long gcd(long a, long b) {
        if (a < b) return gcd(b, a);
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}