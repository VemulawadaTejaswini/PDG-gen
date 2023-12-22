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
        long ans = 0;
        long q = 1;
        a[0] = sc.nextLong();
        A = a[0];
        if (a[0] < 0) {
            q = -1;
        }
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextLong();
            A += a[i];
            q = q * -1;
            if (A <= 0 && q == 1) {
                ans += Math.abs(A - 1);
                A += Math.abs(A - 1);
            } else if (A >= 0 && q == -1) {
                ans += Math.abs(A + 1);
                A -= Math.abs(A + 1);
            }
        }
        System.out.println(ans);
    }
}