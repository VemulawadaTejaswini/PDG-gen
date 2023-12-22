import java.util.Scanner;

public class Main {
    private static long gcd(long a, long b) {
        if (a < b) {
            return gcd(b,a);
        }
        if (a % b == 0) {
            return b;
        }
        return gcd(b, a % b);
    }
    private static long lcm(long a, long b) {
        return (a / gcd(a, b)) * b;
    }
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long res = 1;
        long n = in.nextLong();
        for(int i=0;i<n;i++) {
            long t = in.nextLong();
            res = lcm(res, t);
        }

        System.out.println(res);
    }
}
