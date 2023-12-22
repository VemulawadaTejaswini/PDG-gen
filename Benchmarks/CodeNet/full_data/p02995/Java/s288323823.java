import java.util.Scanner;

public class Main {

    private static final int MOD = 1_000_000_007;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long A = sc.nextLong() - 1;
        long B = sc.nextLong();
        long C = sc.nextLong();
        long D = sc.nextLong();

//        int cnt = 0;
//        for (long i = A; i <= B; i++) {
//            if (i % C == 0) continue;
//            if (i % D == 0) continue;
//
//            cnt++;
//        }

        long lcm = lcm(C, D);

        long Ccnt = (B / C) - (A / C);
        long Dcnt = (B / D) - (A / D);

        long LCMcnt = (B / lcm) - (A / lcm);

        System.out.println(B - A - (Ccnt + Dcnt - LCMcnt));
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
