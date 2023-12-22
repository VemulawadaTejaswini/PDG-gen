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
        long K = Long.parseLong(scanner.next());
        Long[] A = new Long[N];
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(scanner.next());
        }
        Arrays.sort(A);
        Long[] F = new Long[N];
        for (int i = 0; i < N; i++) {
            F[i] = Long.parseLong(scanner.next());
        }
        Arrays.sort(F, Comparator.reverseOrder());

        long l = -1, r = (long) 1e12;
        while (r - l > 1) {
            long mid = (l + r) >>> 1;
            long sum = 0;
            for (int i = 0; i < N; i++) {
                sum += Math.max(0, A[i] - mid / F[i]);
            }
            if (sum <= K) {
                r = mid;
            } else {
                l = mid;
            }
        }

        System.out.println(r);
    }
}
