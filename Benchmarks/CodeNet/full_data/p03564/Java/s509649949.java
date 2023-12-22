import java.util.Scanner;

public class Main {
    private static Scanner sc;

    public Main() {
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        new Main().solve();

    }

    private void solve() {
        int N = sc.nextInt();
        int K = sc.nextInt();
        int ans = 1;
        for (int i = 0; i < N; i++) {
            if (2 * ans < ans + K) {
                ans *= 2;
            } else {
                ans += K;
            }
        }

        System.out.println(ans);
    }
}
