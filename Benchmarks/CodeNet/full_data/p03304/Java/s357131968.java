import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        long n = scan.nextLong();
        long m = scan.nextLong();
        long d = scan.nextLong();
        double ans = 0;
        if (d == 0) {
            for (int i = 0; i < m - 1; i++) {
                ans += ((double) 1) / ((double) n);
            }
        } else {
            for (int i = 0; i < m - 1; i++) {
                ans += ((double) 2 * (n - d)) / ((double) n * n);
            }
        }
        System.out.printf("%.9f\n", ans);
    }
}
