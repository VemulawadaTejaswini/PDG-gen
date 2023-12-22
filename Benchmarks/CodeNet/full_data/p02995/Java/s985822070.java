import java.util.*;
import java.math.*;

public class Main {

    static long MOD = 1000000007;

    public static long gcd(long a, long b) {
        if(b == 0) return a;
        return gcd(b, a%b);
    }

    public static long lcm(long a, long b) {
        return a * b / gcd(a,b);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long ans = (b - a + 1) - ((b / d + b / c - b / lcm(c,d)) - ((a-1) / d + (a-1) / c - (a-1) / lcm(c,d)));
        System.out.println(ans);
    }
}