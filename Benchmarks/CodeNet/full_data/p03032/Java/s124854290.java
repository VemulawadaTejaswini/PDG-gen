import java.util.*;

public class Main {
    static long mod = 1000000007;

    public static long gcd(long a, long b) {
        if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long[] lis = new long[n];

        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
        }

        long r = 0;
        for (int x = 0; x < k; ++x) {
            for (int y = 0; y < k - x; ++y) {
                if (x + y > n) continue;

                long sum = 0;
                int z = k - x - y;

                TreeSet<Long> picked = new TreeSet<Long>();
                for (int i = 0; i < x; ++i) {
                    picked.add(lis[i]);
                    sum += lis[i];
                }
                for (int i = 0; i < y; ++i) {
                    picked.add(lis[n - 1 - i]);
                    sum += lis[n - 1 - i];
                }
                for (int i = 0; i < z && picked.size() > 0; ++i) {
                    long tmp = picked.pollFirst();
                    if (tmp < 0) {
                        sum -= tmp;
                    }
                }

                r = Math.max(r, sum);
            }
        }

        System.out.println(r);
    }
}
