import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int T = sc.nextInt();
        double A = sc.nextDouble();
        double[] H = new double[N];
        long ans = 0;
        double c = INF;
        for (int i = 0; i < N; i++) {
            H[i] = sc.nextDouble();
            if (c > Math.abs(A - (T - H[i] * 0.006))) {
                ans = i + 1;
                c = Math.abs(A - (T - H[i] * 0.006));
            }
        }
        System.out.println(ans);
    }
}