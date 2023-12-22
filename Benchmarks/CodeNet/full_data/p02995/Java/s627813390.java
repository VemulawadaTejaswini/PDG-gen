import java.util.*;

public class Main {
    public static long gcd(long a, long b) {
        while (a % b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return b;
    }
    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
    public static long divnum(long a, long b, long x) {
        return b / x - (a - 1) / x;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        if (d % c == 0) {
            System.out.println(b - a + 1- divnum(a, b, c));
        } else {
            System.out.println(b - a + 1- divnum(a, b, c) - divnum(a, b, d) + divnum(a, b, lcm(c, d)));
        }
    }
}
