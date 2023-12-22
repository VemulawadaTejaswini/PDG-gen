import java.util.*;

public class Main {

    long INF = Long.MAX_VALUE;

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N];
        int[] ab = new int[3 * N];
        for (int i = 0; i < N; i++) {
            a[i] = sc.nextInt();
            ab[i] = a[i];
        }
        for (int i = N; i < 2 * N; i++) {
            ab[i] = a[i - N] - 1;
        }
        for (int i = 2 * N; i < 3 * N; i++) {
            ab[i] = a[i - 2 * N] + 1;
        }
        Arrays.sort(ab);
        long c = 1;
        long ans = 0;
        for (int i = 1; i < 3 * N; i++) {
            if (ab[i] == ab[i - 1]) {
                c++;
            } else {
                ans = Math.max(ans, c);
                c = 1;
            }
        }
        ans = Math.max(ans, c);
        System.out.println(ans);
    }
}
