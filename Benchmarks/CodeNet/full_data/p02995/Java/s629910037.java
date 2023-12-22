import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

        long cGood = (B / C) - ((A - 1) / C);
        long dGood = (B / D) - ((A - 1) / D);
        long cdGood = (B / lcm(C, D)) - ((A - 1) / lcm(C, D));

        long bad = (B - A + 1) - (cGood + dGood - cdGood);
        System.out.println(bad);
    }

    private static long gcd(long x, long y) {
        return y > 0 ? gcd(y, x % y) : x;
    }

    private static long lcm(long x, long y) {
        return x * (y / gcd(x, y));
    }

}
