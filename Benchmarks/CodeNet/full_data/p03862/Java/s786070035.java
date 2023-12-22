import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long x = sc.nextLong();
        long[] a = new long[N];
        long[] b = new long[N];
        long ans = 0;
        long ans2 = 0;
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextLong();
            b[i] = a[i];
        }
        for (int i = 0; i < N; i += 2) {
            if (i - 1 >= 0) {
                long c = a[i - 1] + a[i];
                if (c > x) {
                    ans += Math.abs(x - c);
                    if ((c - a[i]) <= x) {
                        a[i] -= Math.abs(x - c);
                    } else {
                        a[i] = 0;
                        a[i - 1] -= Math.abs((x - a[i]) - c);
                    }
                }
            }
            if (i + 1 < N) {
                long c = a[i + 1] + a[i];
                if (c > x) {
                    ans += Math.abs(x - c);
                    if ((c - a[i]) <= x) {
                        a[i] -= Math.abs(x - c);
                    } else {
                        a[i] = 0;
                        a[i + 1] -= Math.abs((x - a[i]) - c);
                    }
                }
            }
        }
        //偶数
        for (int i = 1; i < N; i += 2) {
            long c = b[i - 1] + b[i];
            if (c > x) {
                ans2 += Math.abs(x - c);
                if ((c - b[i]) <= x) {
                    b[i] -= Math.abs(x - c);
                } else {
                    b[i] = 0;
                    b[i - 1] -= Math.abs((x - b[i]) - c);
                }
            }

            if (i + 1 < N) {
                c = b[i + 1] + b[i];
                if (c > x) {
                    ans2 += Math.abs(x - c);
                    if ((c - b[i]) <= x) {
                        b[i] -= Math.abs(x - c);
                    } else {
                        b[i] = 0;
                        b[i + 1] -= Math.abs((x - b[i]) - c);
                    }
                }
            }
        }
        System.out.println(Math.min(ans2,ans));
    }
}
