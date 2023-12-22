import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long K = sc.nextLong();
        long[] ans = new long[100000];
        Arrays.fill(ans, 0);
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            long b = sc.nextLong();
            a--;
            ans[a] += b;
        }
        for (int i = 0; i < 100000; i++) {
            K = K - ans[i];
            if (K <= 0) {
                System.out.println(i + 1);
                return;
            }

        }
    }

}