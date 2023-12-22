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
        long max = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        long abs = a[n - 1] / 2;
        if (a[n - 1] % 2 != 0) {
            abs++;
        }
        long ans = a[n-1];
        long A = 0;
        for (int i = 0; i < n - 1; i++) {
            long b = Math.abs(a[i] - abs);
            if (ans > b) {
                ans = b;
                A = a[i];
            }
        }
        System.out.println(a[n - 1] + " " + A);
    }
}