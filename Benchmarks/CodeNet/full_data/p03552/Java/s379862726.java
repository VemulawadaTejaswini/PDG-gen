import java.util.Scanner;

public class Main {
    int n;
    long z, w;
    long[] as;
    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        z = sc.nextLong();
        w = sc.nextLong();
        as = new long[n];
        for (int i = 0; i < n; i++)
            as[i] = sc.nextLong();
    }

    private void solve() {
        long[] anss = new long[n];
        for (int xIdx = 0; xIdx < n; xIdx++) {
            long x = as[xIdx];
            long min = xIdx == n - 1 ? Math.abs(w - x) : Long.MAX_VALUE;
            for (int yIdx = xIdx + 1; yIdx < n; yIdx++) {
                long tmp = as[yIdx] - x;
                min = Math.min(min, Math.abs(tmp));
            }
            anss[xIdx] = min;
        }
        long ans = anss[0];
        for (long a: anss)
            ans = Math.max(ans, a);
        System.out.println(ans);
    }
}
