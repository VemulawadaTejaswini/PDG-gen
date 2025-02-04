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
        // long[] sum_l = new long[n];
        // long[] sum_r = new long[n];

        for (int i = 0; i < n; ++i) {
            lis[i] = sc.nextInt();
        }

        // for (int i = 0; i < n; ++i) {
        //     if (i == 0) {
        //         sum_l[i] = lis[i];
        //     } else {
        //         sum_l[i] = lis[i] + sum_l[i-1];
        //     }
        // }
        // for (int i = n - 1; i >= 0; --i) {
        //     if (i == n - 1) {
        //         sum_r[i] = lis[i];
        //     } else {
        //         sum_r[i] = lis[i] + sum_r[i+1];
        //     }
        // }

        long r = 0;
        for (int x = 0; x < k; ++x) {
            for (int y = 0; y < k - x; ++y) {
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
