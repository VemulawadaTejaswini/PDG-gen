import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    public void solve() {
        Scanner scan = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        int N = scan.nextInt();
        // 4/N = 1/h + 1/w + 1/n
        // 4 * h * w * n = N * (h * w + w * n + n * h)
        // 4 * h * w * n - N * w * n - N * h * n = N * h * w
        // (4 * h * w - N * w - N * h) * n = N * h * w
        for (long h = 1; h <= 3500; h++) {
            for (long w = 1; w <= 3500; w++) {
                long x = 4 * h * w - N * w - N * h;
                if (x <= 0) {
                    continue;
                }
                long y = N * h * w;
                if (y % x == 0) {
                    System.out.printf("%d %d %d\n", h, w, y / x);
                    return;
                }
            }
        }
    }
}
