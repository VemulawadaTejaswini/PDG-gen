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
        long N = scanner.nextLong();
        long M = scanner.nextLong();
        long ans = solve(N - 1) ^ solve(M);
        System.out.println(ans);
    }

    private static long solve(long n) {
        long res = 0;
        if (n % 2 == 0) {
            res = n;
        }
        if (((n + 1) / 2) % 2 != 0) {
            res++;
        }
        return res;
    }
}