import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        // a未満の数で割り切れないｍン
        long c2 = (a - 1) / c;
        long d2 = (a - 1) / d;
        long cd2 = (a - 1) / lcm(c, d);
        long aa = a - (c2 + d2 - cd2);

        //b以下
        long c1 = b / c;
        long d1 = b / d;
        long cd1 = b / lcm(c, d);
        long bb = b - (c1 + d1 - cd1);

        System.out.println(bb - aa + 1);

    }

    private static long gcd(long m, long n) {
        if(m < n) return gcd(n, m);
        if(n == 0) return m;
        return gcd(n, m % n);
    }

    private static long lcm(long m, long n) {
        return m * n / gcd(m, n);
    }

}
