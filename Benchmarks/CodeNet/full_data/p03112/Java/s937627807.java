import java.util.Arrays;
import java.util.Scanner;

class Problem {
    private Scanner sc;
    private int A;
    private int B;
    private int Q;
    private long[] s;
    private long[] t;

    Problem() {
        sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        Q = sc.nextInt();

        s = new long[A];
        t = new long[B];

        for (int i = 0; i < A; i++) {
            s[i] = sc.nextLong();
        }
        for (int i = 0; i < B; i++) {
            t[i] = sc.nextLong();
        }
    }

    int find(long[] P, long q) {
        int st = 0;
        int ed = P.length - 1;
        if (q < P[st]) return -1;
        if (q > P[ed]) return P.length - 1;

        while (st != ed) {
            if (q == P[st]) return st;
            if (q == P[ed]) return ed;

            int pivot = (st + ed) / 2;

            if (P[pivot] <= q && q < P[pivot+1]) {
                return pivot;
            } else if (q < P[pivot]) {
                ed = pivot;
            } else {
                st = pivot;
            }
        }
        return st;
    }

    long query(long q) {
        int si = find(s, q);
        int ti = find(t, q);

        int sLeft = si;
        int sRight = (si >= 0 && s[si] == q) ? si : si + 1;
        int tLeft = ti;
        int tRight = (ti >= 0 && t[ti] == q) ? ti : ti + 1;

        long ans = Long.MAX_VALUE;

        if (sLeft >= 0 && tLeft >= 0) {
            ans = Math.min(ans, Math.max(q - s[sLeft], q - t[tLeft]));
        }
        if (sRight < A && tRight < B) {
            ans = Math.min(ans, Math.max(s[sRight] - q, t[tRight] - q));
        }
        if (sLeft >= 0 && tRight < B) {
            ans = Math.min(
                    ans,
                    Math.min(Math.abs(s[sLeft] - q), Math.abs(t[tRight] - q)) + Math.abs(s[sLeft] - t[tRight])
            );
        }
        if (tLeft >= 0 && sRight < A) {
            ans = Math.min(
                    ans,
                    Math.min(Math.abs(t[tLeft] - q), Math.abs(s[sRight] - q)) + Math.abs(t[tLeft] - s[sRight])
            );
        }
        return ans;
    }

    void solve() {
        long[] ans = new long[Q];
        for (int i = 0; i < Q; i++) {
            long q = sc.nextLong();
            ans[i] = query(q);
        }
        for (int i = 0; i < Q; i++) {
            System.out.println(ans[i]);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        new Problem().solve();
    }
}
