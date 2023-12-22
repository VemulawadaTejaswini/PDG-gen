import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int W = sc.nextInt();
        long[] w = new long[N];
        long[] v = new long[N];

        for (int i = 0; i < N; i++) {
            w[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }

        System.out.println(rec(N, w, v, 0, W));
    }

    private static long rec(int n, long[] w, long[] v, int i, int j) {
        long res;
        if (i == n) {
            res = 0;
        } else if (j < w[i]) {
            res = rec(n, w, v, i + 1, j);
        } else {
            if (rec(n, w, v, i + 1, j) > rec(n, w, v, i + 1, j - (int) w[i]) + v[i]) {
                res = rec(n, w, v, i + 1, j);
            } else {
                res = rec(n, w, v, i + 1, j - (int) w[i]) + v[i];
            }
        }
        return res;
    }
}
