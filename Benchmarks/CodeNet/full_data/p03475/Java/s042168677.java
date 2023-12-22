import java.io.*;
import java.util.*;
import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        new Main().solve();
    }

    final int infinity = Integer.MAX_VALUE / 256;
    int next(final int n, final int time) {
        if (n == N - 1) return time;
        int lb = 0, ub = infinity;
        Predicate<Integer> f = (Integer x) -> {
            return time <= S[n] + F[n] * x;
        };
        if (f.test(lb)) {
            ub = lb;
        } else {
            while (lb + 1 < ub) {
                int mid = lb + (ub - lb) / 2;
                if (f.test(mid)) {
                    ub = mid;
                } else {
                    lb = mid;
                }
            }
        }
        return S[n] + F[n] * ub;
    }

    void calc(int n) {
        if (n == N - 1) {
            System.out.println(0);
            return;
        }
        int t = S[n];
        for (; n < N - 1; n++) {
            t = next(n + 1, t + C[n]);
        }
        System.out.println(t);
    }

    int N;
    int[] S, F, C;
    void solve() {
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        S = new int[N - 1];
        F = new int[N - 1];
        C = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            C[i] = scanner.nextInt();
            S[i] = scanner.nextInt();
            F[i] = scanner.nextInt();
        }
        for (int i = 0; i < N; i++) {
            calc(i);
        }
    }
}