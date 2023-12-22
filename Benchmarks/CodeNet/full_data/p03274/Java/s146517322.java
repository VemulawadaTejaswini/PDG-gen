import java.util.*;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] x = new int[N];
        int[] X = new int[N];
        int s = 0;
        long ans = Long.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            X[i] = Math.abs(x[i]);
        }
        for (int i = 0; i <=N - K; i++) {
            int num = Math.abs(x[i] - x[i + K - 1]) + Math.min(X[i], X[i + K - 1]);
            if(ans>num){
                ans=num;
            }
        }
        System.out.println(ans);
    }
}
