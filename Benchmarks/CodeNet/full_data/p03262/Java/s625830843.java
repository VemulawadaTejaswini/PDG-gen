import java.util.*;

public class Main {

    int INF = Integer.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int[] x = new int[N + 1];
        int a = 0;
        int b = 0;
        for (int i = 0; i <N; i++) {
            x[i] = sc.nextInt();
        }
        x[N]=X;
        Arrays.sort(x);
        int ans = INF;
        for (int i = 1; i <= N; i++) {
            ans = Math.min(Math.abs(x[i] - x[i - 1]), ans);
        }
        System.out.println(ans);

    }
}