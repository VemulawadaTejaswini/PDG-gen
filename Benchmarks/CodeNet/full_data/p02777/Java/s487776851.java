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
        String key1 = scanner.next();
        String key2 = scanner.next();
        int val1 = Integer.parseInt(scanner.next());
        int val2 = Integer.parseInt(scanner.next());
        String key3 = scanner.next();

        if (key1.equals(key3)) {
            val1--;
        } else {
            val2--;
        }

        System.out.printf("%d %d\n", val1, val2);
    }
}

