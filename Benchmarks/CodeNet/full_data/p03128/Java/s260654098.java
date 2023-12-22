

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    static final int[] cost = new int[]{
            2, 5, 5, 4, 5, 6, 3, 7, 6
    };

    static long ans = 0;
    static int n;
    static int m;
    static int[] a;

    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        a = new int[m];
        for (int i = 0; i < m; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            int c = cost[a[i] - 1];
            if (c > n) {
                continue;
            }
            solve(n - c, a[i]);
        }
        System.out.println(ans);
    }

    static void solve(int n, long sum) {
        if (n == 0) {
            ans = Math.max(ans, sum);
            return;
        }
        for (int i = 0; i < m; i++) {
            int c = cost[a[i] - 1];
            if (c > n) {
                continue;
            }
            long temp = sum * 10 + a[i];
            solve(n - c, temp);
        }
    }
}
