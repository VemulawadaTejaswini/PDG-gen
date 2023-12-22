import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        int ans = 0;
        for (int i = 1; i <= n-2; i++) {
            if ((p[i - 1] < p[i] && p[i] <= p[i + 1])
                    ||
                (p[i - 1] >= p[i] && p[i] > p[i + 1])) {
                ans++;
            }
        }
        System.out.print(ans);
    }

    // Main
    public static void main(String[] args) {
        new Main().solve();
    }
}

