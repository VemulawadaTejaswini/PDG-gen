import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        boolean[] f = new boolean[100001];
        int[] c = new int[100002];
        int N, L, R;
        for (int i = 2; i < 100000; i++) {
            if (!f[i]) {
                for (int j = i + i; j <= 100000; j += i) {
                    f[j] = true;
                }
            }
        }
        for (int i = 3; i <= 100000; i += 2) {
            if (!f[i] && !f[(i + 1) / 2]) {
                c[i]++;
            }
        }
        for (int i = 3; i <= 100000; i++) {
            c[i] += c[i - 1];
        }
        N = sc.nextInt();
        while (N-- != 0) {
            L = sc.nextInt();
            R = sc.nextInt();
            System.out.println(c[R] - c[L - 1]);
        }
    }
}