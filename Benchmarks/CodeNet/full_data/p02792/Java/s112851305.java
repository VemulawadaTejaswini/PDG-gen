import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main implements Runnable {

    private static int MOD = 1_000_000_007;

    public static void main(String[] args) {
        // Run with 32MB stack
        Thread thread = new Thread(null, new Main(), "", 32 * 1024 * 1024);
        thread.start();
    }

    @Override
    public void run() {
        final Scanner scanner = new Scanner(System.in);
        solve(scanner);
    }

    static void solve(Scanner scanner) {
        int N = Integer.parseInt(scanner.next());
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            int s = i;
            while (s > 9) {
                s /= 10;
            }
            int e = i % 10;

            if (e == 0) {
                continue;
            }

            // System.out.printf("Processing: %d\n", i);
            long tmp = 0;

            // 1 digit: 111 -> 1, 121 -> 1
            if (s == e) {
                tmp++;
            }

            int op = e * 10 + s;
            // 2 digits: 111 -> 11, 112 -> 21
            if (op <= N) {
                tmp++;
                op = (op / 10) * 100 + s;
            }

            // 3 or more digits: 1111 -> 1**1
            int d = 0;
            while (op <= N) {
                // System.out.printf("big: %d +%d\n", op, 1);
                op = (op / 10) * 100 + s;
                d++;;
            }

            ans += tmp + Math.pow(10, d - 1);
        }

        System.out.println(ans);
    }

}

