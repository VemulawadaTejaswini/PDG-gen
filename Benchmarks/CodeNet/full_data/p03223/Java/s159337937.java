import java.util.*;

/**
 * Copyright © 2018 Chris. All rights reserved.
 *
 * @author Chris
 * 2018/7/5 22:51
 */
public class Main {

    final static int MOD = 1000000007;
    static Scanner sc;

    private static int comb(int n, int m) {
        return 1;
    }

    static void getDiv(Map<Integer, Integer> map, int n) {
        int sqrt = (int) Math.sqrt(n);
        for (int i = sqrt; i >= 2; i--) {
            if (n % i == 0) {
                getDiv(map, i);
                getDiv(map, n / i);
                return;
            }
        }
        map.put(n, map.getOrDefault(n, 0) + 1);
    }

    @SuppressWarnings("unchecked")
    private static void solve() {
        int n = nextInt();
        long a[] = new long[n];
        Set<Long> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a[i] = nextInt();
            set.add(a[i]);
        }
        Arrays.sort(a);
        boolean low = false;
        int i = 1;
        int j = n - 2;
        long ans = a[n - 1] - a[0];
        int u = 0;
        int v = n - 1;

        while (i <= j) {
            if (i == j) {
                ans += Math.max(Math.abs(a[i] - a[u]), Math.abs(a[i] - a[v]));
                break;
            }
            long pre = Math.abs(a[j] - a[u]);
            long rear = Math.abs(a[i] - a[v]);
            if (pre > rear) {
                ans += pre;
                u = j--;
            } else {
                ans += rear;
                v = i++;
            }
            if (a[u] > a[v]) {
                u ^= v;
                v ^= u;
                u ^= v;
            }
        }

        System.out.println(ans);
    }

    static long gcd(long a, long b) {
        if (a < b) {
            a ^= b;
            b ^= a;
            a ^= b;
        }
        while (b != 0) {
            long tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String args[]) {
        sc = new Scanner(System.in);
        solve();
    }

    private static int nextInt() {
        return sc.nextInt();
    }

    private static long nextLong() {
        return sc.nextLong();
    }

    private static String next() {
        return sc.next();
    }

    private static double nextDouble() {
        return sc.nextDouble();
    }
}