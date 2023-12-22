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
        int M = Integer.parseInt(scanner.next());
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < M; i++) {
            a.append(N);
        }
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < N; i++) {
            b.append(M);
        }
        System.out.println(a.toString().compareTo(b.toString()) < 0 ? a.toString() : b.toString());
    }

}
