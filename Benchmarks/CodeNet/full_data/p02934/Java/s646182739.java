import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;
    long[][] dp;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] A = new double[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextDouble();
        }
        double ans =0;
        for (int i = 0; i < N; i++) {
            ans += 1/A[i];
        }
        System.out.println(1/ans);
    }

}
