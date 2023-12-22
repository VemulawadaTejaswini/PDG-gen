import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[] dp;
    long n;
    long S;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char[] S = s.toCharArray();
        int[] ans = new int[s.length()];
        int c = 0;
        int c1 = 1;
        for (int i = 0; i < s.length(); i++) {
            if (i > 0) {
                if (S[i] == S[i - 1]) {
                    c1++;
                } else {
                    c = Math.max(c, c1);
                    c1 = 1;
                }
            }
        }
        int rc = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                if (S[i] == 'R') {
                    ans[i] += rc;
                }
                continue;
            }
            if (S[i] == 'R') {
                if (S[i + 1] == S[i]) {
                    rc++;
                } else {
                    rc++;
                    ans[i] += rc / 2 + rc % 2;
                    ans[i + 1] += rc / 2;
                    rc = 0;
                }
            }
        }
        int lc = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (i == 0) {
                if (S[i] == 'L') {
                    ans[i] += lc;
                }
                continue;
            }
            if (S[i] == 'L') {
                if (S[i - 1] == S[i]) {
                    lc++;
                } else {
                    lc++;
                    ans[i] += lc / 2 + lc % 2;
                    ans[i - 1] += lc / 2;
                    lc = 0;
                }
            }
        }
        for (int i = 0; i < s.length(); i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();

    }

    int gcd(int m, int n
    ) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}