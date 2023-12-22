import java.util.Arrays;
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
        int[] ns = new int[N];
        for (int i = 0; i < N; i++) {
            ns[i] = sc.nextInt();
        }
        Arrays.sort(ns);
        int ans = 0;
        for (int i = 1; i <= K; i++) {
            ans += ns[N - i];
        }

        System.out.println(ans);
    }
}
