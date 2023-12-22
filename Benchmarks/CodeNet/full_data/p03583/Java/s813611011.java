
import java.util.Scanner;

public class Main {
    int N;

    public static void main(String[] args) {
        Main m = new Main();
        m.read();
        m.solve();
    }

    private void read() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }

    private void solve() {
        long w = 0, n, h = 0;
        long a, b;
        for (n = 1; n <= 3500; n++) {
            for (h = 1; h <= 3500; h++) {
                a = 4 * h * n - N * (n + h);
                b = N * h * n;
                if (a > 0 && b > 0 && b % a == 0) {
                    w = b / a;
                    break;
                }
            }
            if (w != 0)
                break;
        }
        System.out.printf("%d %d %d\n", n, h, w);
    }
}
