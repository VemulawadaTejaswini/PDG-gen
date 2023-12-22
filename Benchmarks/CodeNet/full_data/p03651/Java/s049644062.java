import java.util.*;

public class Main {

    int[] a;
    int cost;
    int N;
    int[] dp;
    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = sc.nextInt();
        }
        Arrays.sort(A);
        boolean p = false;
        boolean f = false;
        boolean F = false;
        for (int i = 1; i < N; i++) {
            if (A[i] == (A[i-1] + 1)) {
                p = true;
            }
            if (A[i] > K) {
                f = true;
            }
            if (A[i] == K) {
                F = true;
            }
        }
        System.out.println(p && f || F ? "POSSIBLE" : "IMPOSSIBLE");
    }
}
