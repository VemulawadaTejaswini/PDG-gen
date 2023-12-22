import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().solve();
    }

    void solve() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        long A = 0;
        long ANS = 0;
        long ans = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            A += a[i];
            if (i % 2 == 0 && A <= 0) {
                ans += Math.abs(A - 1);
                A = 1;
            }
            if (i % 2 == 1 && A >= 0) {
                ans += Math.abs(A + 1);
                A = -1;
            }
        }
        ANS = ans;
        A = 0;
        ans = 0;
        for (int i = 0; i < n; i++) {
            A += a[i];
            if (i % 2 == 0 && A >= 0) {
                ans += Math.abs(A + 1);
                A = -1;
            }
            if (i % 2 == 1 && A <= 0) {
                ans += Math.abs(A - 1);
                A = 1;
            }
        }
        ANS = Math.min(ANS, ans);
        System.out.println(ANS);
    }
}
