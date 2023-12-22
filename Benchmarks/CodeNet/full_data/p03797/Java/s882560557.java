import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        long M = sc.nextLong();
        long ans = 0;
        if (N * 2 <= M) {
            M -= 2 * N;
            ans += N;
        } else {
            M = M / 2;
            System.out.println(M);
            return;
        }
        M = M / 4;
        ans += M;
        System.out.println(ans);

    }
}
