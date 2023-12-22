import java.math.BigInteger;
import java.util.*;

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
        long N = Long.parseLong(scanner.next());
        long max = 1;
        for (long i = 1; i * i <= N ; i++) {
            if (N % i == 0) {
                max = i;
            }
        }
        System.out.println(max + N / max - 2);
    }
}
