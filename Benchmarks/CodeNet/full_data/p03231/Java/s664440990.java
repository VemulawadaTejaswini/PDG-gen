import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int ans = (N / gcd(N, M))*M;
        String S = sc.next();
        String T = sc.next();
        char[] s = S.toCharArray();
        char[] t = T.toCharArray();
        long g = gcd(N, M);
        char[] X = new char[ans + 1];
        boolean[] x = new boolean[ans + 1];
        Arrays.fill(x, false);
        X[1] = s[0];
        x[1]=true;
        for (int i = 1; i < N; i++) {
            X[i * (ans / N) + 1] = s[i];
            x[i * (ans / N) + 1] = true;
        }
        for (int i = 0; i < M; i++) {
            if (x[i * (ans / M) + 1]) {
                if (X[i * (ans / M) + 1] != t[i]) {
                    System.out.println("-1");
                    return;
                }
            }
        }
        System.out.println(ans);
    }

    int gcd(int m, int n) {
        if (m < n) {
            return gcd(n, m);
        }
        if (n == 0) {
            return m;
        }
        return gcd(n, m % n);
    }
}
