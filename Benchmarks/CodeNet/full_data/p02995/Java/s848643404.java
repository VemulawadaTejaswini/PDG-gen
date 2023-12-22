import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong() - 1;
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();

        long s1 = a - (a / c + a / d - a / lcm(c, d));
        long s2 = b - (b / c + b / d - b / lcm(c, d));

        System.out.println(s2 - s1);
    }

    static long gcd(long a, long b) {
        if (b % a == 0) {
            return a;
        }
        return gcd(b % a, a);
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
