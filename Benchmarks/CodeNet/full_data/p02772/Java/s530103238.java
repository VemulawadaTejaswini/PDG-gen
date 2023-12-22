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
        int N = Integer.parseInt(scanner.next());
        boolean ok = true;
        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(scanner.next());
            if (a % 2 == 1) continue;
            if (a % 3 != 0 && a % 5 != 0) {
                ok = false;
            }
        }
        System.out.println(ok ? "APPROVED" : "DENIED");
    }

}

