import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long P = sc.nextLong();

        long ans = gcd(P, N);
        System.out.println(ans);
    }

    private static long gcd(long n, long num) {
        long gcd = 1;

        long m = n;
        int count = 0;
//        while (m % 2 == 0) {
//            count++;
//            m = m / 2;
//        }
//        if (count >= num) {
//            gcd *= (long) Math.pow(2, count / num);
//        }

        for (int i = 2; (i * i) <= n; i++) {
            count = 0;
            long f = 2 * i + 1;
            while (m % f == 0) {
                count++;
                m /= f;
            }
            if (count >= num) {
                gcd *= (long) Math.pow(f, count / num);
            }
        }
        return gcd;
    }
}
