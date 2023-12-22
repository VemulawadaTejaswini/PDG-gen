import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

class Main {

    static final int MOD = 1000000007;
    static final int INF = 1 << 30;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        int[] a = new int[N];
        int max = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }
        int[] lcm = new int[max + 1];
        List<Integer> prime = primeList((int)Math.sqrt(max)+1);
        for (int i = 0; i < N; i++) {
            int n = a[i];
            for (int p : prime) {
                int cnt = 0;
                while (n % p == 0) {
                    cnt++;
                    n /= p;
                }
                lcm[p] = Math.max(lcm[p], cnt);
                if (p * p > n)
                    break;
            }
            if (n != 1) {
                lcm[n] = Math.max(lcm[n], 1);
                prime.add(n);
            }
        }

        for (int i = 0; i < N; i++) {
            int n = a[i];
            long pls = 1;
            for (int p : prime) {
                int cnt = 0;
                // System.out.println(lcm[p]);
                if (lcm[p] > 0) {
                    while (n % p == 0) {
                        n /= p;
                        cnt++;
                    }
                    pls *= pow(p, lcm[p] - cnt);
                    pls %= MOD;
                }
            }
            ans += pls;
            ans %= MOD;
            // System.out.println(ans);
        }
        // System.out.println(Arrays.toString(prime.toArray()));
        System.out.println(ans);
    }

    private static List<Integer> primeList(int max) {
        final List<Integer> prime = new ArrayList<Integer>();
        prime.add(2);
        for (int i = 3; i <= max; i += 2) {
            for (int wari : prime) {
                if (i % wari == 0)
                    break;
                if (wari * wari > i) {
                    prime.add(i);
                    break;
                }
            }
        }
        return prime;
    }

    public static long pow(long x, long n) {
        long sum = 1;
        while (n > 0) {
            if ((n & 1) == 1) {
                sum = sum * x % MOD;
            }
            x = x * x % MOD;
            n >>= 1;
        }
        return sum;
    }
}
