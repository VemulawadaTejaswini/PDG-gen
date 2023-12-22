import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        long a1 = (b / c) - ((a - 1) / c);
        long b1 = (b / d) - ((a - 1) / d);
        long lcm = lcm(c, d);
        long lcm1 = (b / lcm) - (a / lcm);
        long ans = a1 + b1 - lcm1;
        System.out.println(b - a - ans +1);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }

    public static long gcd(long a, long b) {
        if( b == 0 ) return a;
        return gcd(b, a % b);
    }
}